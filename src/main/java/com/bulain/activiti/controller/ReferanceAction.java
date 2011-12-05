package com.bulain.activiti.controller;

import java.util.ArrayList;
import java.util.List;

import com.bulain.activiti.model.Referance;
import com.bulain.activiti.pojo.Item;
import com.bulain.activiti.pojo.ItemConst;
import com.bulain.activiti.pojo.ReferanceBean;
import com.bulain.activiti.pojo.ReferanceSearch;
import com.bulain.activiti.pojo.ReferanceView;
import com.bulain.activiti.service.ReferanceService;
import com.bulain.common.controller.PageSupportActionSupport;

public class ReferanceAction extends PageSupportActionSupport {
    private static final long serialVersionUID = -6586209271699101686L;

    private Integer id;

    private ReferanceSearch search;
    private Referance referance;
    private ReferanceBean referanceBean;
    private List<ReferanceView> listReferance;

    private ReferanceService referanceService;

    private List<Item> listReferanceName;
    private List<Item> listReferanceLang;
    private List<Item> listReferanceCategory;

    public String list() {
        search = (ReferanceSearch) getSearchFromSession(ReferanceSearch.class, search);
        page = getPageFromSession();

        List<Referance> list = referanceService.page(search, page);
        listReferance = formatList(list);

        putSearchToSession(ReferanceSearch.class, search);
        putPageToSession();

        return SUCCESS;
    }

    public String newn() {
        referanceBean = new ReferanceBean();
        return SUCCESS;
    }
    public String create() {
        referanceService.insert(referanceBean);
        return SUCCESS;
    }
    public String show() {
        referance = referanceService.get(id);
        referance = formatItem(referance);
        return SUCCESS;
    }
    public String edit() {
        referance = referanceService.get(id);
        return SUCCESS;
    }
    public String update() {
        referanceService.update(referance, false);
        return SUCCESS;
    }
    public String destroy() {
        referanceService.delete(id);
        return SUCCESS;
    }

    public void validate() {
        super.validate();
        if (this.hasErrors()) {
            prepareEdit();
        }
    }
    public void prepareList() {
        listReferanceName = referanceService.findItem(ItemConst.NAME_REFERANCE, getLanguage());
        listReferanceLang = referanceService.findItem(ItemConst.NAME_LANGUAGE, getLanguage());
        listReferanceCategory = referanceService.findItem(ItemConst.NAME_CATEGORY, getLanguage());
    }
    public void prepareNewn() {
        prepareList();
    }
    public void prepareEdit() {
        prepareList();
    }

    protected List<ReferanceView> formatList(List<Referance> list) {
        List<ReferanceView> listView = new ArrayList<ReferanceView>();
        for (Referance ref : list) {
            listView.add(formatItem(ref));
        }
        return listView;
    }

    protected ReferanceView formatItem(Referance ref) {
        ReferanceView refv = new ReferanceView(ref);
        refv.setNameName(referanceService.getText(ItemConst.NAME_REFERANCE, refv.getName(), getLanguage()));
        refv.setLangName(referanceService.getText(ItemConst.NAME_LANGUAGE, refv.getLang(), getLanguage()));
        refv.setCategoryName(referanceService.getText(ItemConst.NAME_CATEGORY, refv.getCategory(), getLanguage()));
        return refv;
    }

    public ReferanceSearch getSearch() {
        return search;
    }

    public void setSearch(ReferanceSearch search) {
        this.search = search;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Referance getReferance() {
        return referance;
    }

    public void setReferance(Referance referance) {
        this.referance = referance;
    }

    public List<ReferanceView> getListReferance() {
        return listReferance;
    }

    public void setListReferance(List<ReferanceView> listReferance) {
        this.listReferance = listReferance;
    }

    public void setReferanceService(ReferanceService referanceService) {
        this.referanceService = referanceService;
    }

    public ReferanceBean getReferanceBean() {
        return referanceBean;
    }

    public void setReferanceBean(ReferanceBean referanceBean) {
        this.referanceBean = referanceBean;
    }

    public List<Item> getListReferanceName() {
        return listReferanceName;
    }

    public void setListReferanceName(List<Item> listReferanceName) {
        this.listReferanceName = listReferanceName;
    }

    public List<Item> getListReferanceLang() {
        return listReferanceLang;
    }

    public void setListReferanceLang(List<Item> listReferanceLang) {
        this.listReferanceLang = listReferanceLang;
    }

    public List<Item> getListReferanceCategory() {
        return listReferanceCategory;
    }

    public void setListReferanceCategory(List<Item> listReferanceCategory) {
        this.listReferanceCategory = listReferanceCategory;
    }

}
