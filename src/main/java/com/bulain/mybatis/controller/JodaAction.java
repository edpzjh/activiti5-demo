package com.bulain.mybatis.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;

import com.bulain.common.controller.PageSupportActionSupport;
import com.bulain.mybatis.model.Joda;
import com.bulain.mybatis.pojo.JodaSearch;
import com.bulain.mybatis.pojo.JodaView;
import com.bulain.mybatis.service.JodaService;

public class JodaAction extends PageSupportActionSupport{
    private static final long serialVersionUID = -985235699430511943L;
    private static final Logger LOG = LoggerFactory.getLogger(JodaAction.class);

    private Integer id;

    private JodaSearch search;
    private Joda joda;
    private List<JodaView> listJoda;
    
    private transient JodaService jodaService;
    
    public String list(){
        search = (JodaSearch) getSearchFromSession(JodaSearch.class, search);
        page = getPageFromSession();
        
        List<Joda> list = jodaService.page(search, page);
        listJoda = formatList(list);
        
        putSearchToSession(JodaSearch.class, search);
        putPageToSession();
        
        return SUCCESS;
    }
    
    public String newn(){
        joda = new Joda();
        return SUCCESS;
    }
    public String create(){
        try{
            jodaService.insert(joda);
            String msg = getText("common.createInfo", new String[]{"Joda"});
            addActionMessage(msg);
        }catch (Exception e) {
            LOG.error("create()", e);
            String msg = getText("common.createError", new String[]{"Joda"});
            addActionError(msg);
            return ERROR;
        }
        return SUCCESS;
    }
    public String show(){
        joda = jodaService.get(id);
        return SUCCESS;
    }
    public String edit(){
        joda = jodaService.get(id);
        return SUCCESS;
    }
    public String update(){
        try{
            jodaService.update(joda, false);
            String msg = getText("common.updateInfo", new String[]{"Joda"});
            addActionMessage(msg);
        }catch (Exception e) {
            LOG.error("update()", e);
            String msg = getText("common.updateError", new String[]{"Joda"});
            addActionError(msg);
            return ERROR;
        }
        return SUCCESS;
    }
    public String destroy(){
        try{
            jodaService.delete(id);
            String msg = getText("common.deleteInfo", new String[]{"Joda"});
            addActionMessage(msg);
        }catch (Exception e) {
            LOG.error("destroy()", e);
            String msg = getText("common.deleteError", new String[]{"Joda"});
            addActionError(msg);
            return ERROR;
        }
        return SUCCESS;
    }


    public void prepareUpdate(){
        if (id != null) {
            joda = jodaService.get(id);
        }
    }
    
    protected List<JodaView> formatList(List<Joda> list){
        List<JodaView> listView = new ArrayList<JodaView>();
        for(Joda joda : list){
            listView.add(formatItem(joda));
        }
        return listView;
    }
    
    protected JodaView formatItem(Joda joda){
        JodaView view = new JodaView();
        BeanUtils.copyProperties(joda, view);
        return view;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public JodaSearch getSearch() {
        return search;
    }

    public void setSearch(JodaSearch search) {
        this.search = search;
    }

    public Joda getJoda() {
        return joda;
    }

    public void setJoda(Joda joda) {
        this.joda = joda;
    }
   
    public List<JodaView> getListJoda() {
        return listJoda;
    }

    public void setListJoda(List<JodaView> listJoda) {
        this.listJoda = listJoda;
    }

    public void setJodaService(JodaService jodaService) {
        this.jodaService = jodaService;
    }
   
}