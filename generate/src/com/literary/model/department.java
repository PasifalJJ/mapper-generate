package com.literary.model;

import java.util.Date;

public class department {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_department.id
     *
     * @mbggenerated Tue May 07 13:34:43 CST 2019
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_department.name
     *
     * @mbggenerated Tue May 07 13:34:43 CST 2019
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_department.depno
     *
     * @mbggenerated Tue May 07 13:34:43 CST 2019
     */
    private String depno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_department.createtime
     *
     * @mbggenerated Tue May 07 13:34:43 CST 2019
     */
    private Date createtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_department.build_date
     *
     * @mbggenerated Tue May 07 13:34:43 CST 2019
     */
    private Date buildDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_department.pid
     *
     * @mbggenerated Tue May 07 13:34:43 CST 2019
     */
    private String pid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_department.id
     *
     * @return the value of t_department.id
     *
     * @mbggenerated Tue May 07 13:34:43 CST 2019
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_department.id
     *
     * @param id the value for t_department.id
     *
     * @mbggenerated Tue May 07 13:34:43 CST 2019
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_department.name
     *
     * @return the value of t_department.name
     *
     * @mbggenerated Tue May 07 13:34:43 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_department.name
     *
     * @param name the value for t_department.name
     *
     * @mbggenerated Tue May 07 13:34:43 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_department.depno
     *
     * @return the value of t_department.depno
     *
     * @mbggenerated Tue May 07 13:34:43 CST 2019
     */
    public String getDepno() {
        return depno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_department.depno
     *
     * @param depno the value for t_department.depno
     *
     * @mbggenerated Tue May 07 13:34:43 CST 2019
     */
    public void setDepno(String depno) {
        this.depno = depno == null ? null : depno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_department.createtime
     *
     * @return the value of t_department.createtime
     *
     * @mbggenerated Tue May 07 13:34:43 CST 2019
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_department.createtime
     *
     * @param createtime the value for t_department.createtime
     *
     * @mbggenerated Tue May 07 13:34:43 CST 2019
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_department.build_date
     *
     * @return the value of t_department.build_date
     *
     * @mbggenerated Tue May 07 13:34:43 CST 2019
     */
    public Date getBuildDate() {
        return buildDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_department.build_date
     *
     * @param buildDate the value for t_department.build_date
     *
     * @mbggenerated Tue May 07 13:34:43 CST 2019
     */
    public void setBuildDate(Date buildDate) {
        this.buildDate = buildDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_department.pid
     *
     * @return the value of t_department.pid
     *
     * @mbggenerated Tue May 07 13:34:43 CST 2019
     */
    public String getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_department.pid
     *
     * @param pid the value for t_department.pid
     *
     * @mbggenerated Tue May 07 13:34:43 CST 2019
     */
    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }
}