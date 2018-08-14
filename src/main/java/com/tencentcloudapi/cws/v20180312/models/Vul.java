/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.cws.v20180312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Vul  extends AbstractModel{

    /**
    * 是否已经添加误报，0-否，1-是。
    */
    @SerializedName("IsReported")
    @Expose
    private Integer IsReported;

    /**
    * 云用户appid。
    */
    @SerializedName("Appid")
    @Expose
    private Integer Appid;

    /**
    * 云用户标识。
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 漏洞ID。
    */
    @SerializedName("Id")
    @Expose
    private Integer Id;

    /**
    * 站点ID。
    */
    @SerializedName("SiteId")
    @Expose
    private Integer SiteId;

    /**
    * 扫描引擎的扫描任务ID。
    */
    @SerializedName("TaskId")
    @Expose
    private Integer TaskId;

    /**
    * 漏洞级别：high、middle、low、notice。
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * 漏洞名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 出现漏洞的url。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 网址/细节。
    */
    @SerializedName("Html")
    @Expose
    private String Html;

    /**
    * 漏洞类型。
    */
    @SerializedName("Nickname")
    @Expose
    private String Nickname;

    /**
    * 危害说明。
    */
    @SerializedName("Harm")
    @Expose
    private String Harm;

    /**
    * 漏洞描述。
    */
    @SerializedName("Describe")
    @Expose
    private String Describe;

    /**
    * 解决方案。
    */
    @SerializedName("Solution")
    @Expose
    private String Solution;

    /**
    * 漏洞参考。
    */
    @SerializedName("From")
    @Expose
    private String From;

    /**
    * 漏洞通过该参数攻击。
    */
    @SerializedName("Parameter")
    @Expose
    private String Parameter;

    /**
    * CreatedAt。
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * UpdatedAt。
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
     * 获取是否已经添加误报，0-否，1-是。
     * @return IsReported 是否已经添加误报，0-否，1-是。
     */
    public Integer getIsReported() {
        return this.IsReported;
    }

    /**
     * 设置是否已经添加误报，0-否，1-是。
     * @param IsReported 是否已经添加误报，0-否，1-是。
     */
    public void setIsReported(Integer IsReported) {
        this.IsReported = IsReported;
    }

    /**
     * 获取云用户appid。
     * @return Appid 云用户appid。
     */
    public Integer getAppid() {
        return this.Appid;
    }

    /**
     * 设置云用户appid。
     * @param Appid 云用户appid。
     */
    public void setAppid(Integer Appid) {
        this.Appid = Appid;
    }

    /**
     * 获取云用户标识。
     * @return Uin 云用户标识。
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * 设置云用户标识。
     * @param Uin 云用户标识。
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * 获取漏洞ID。
     * @return Id 漏洞ID。
     */
    public Integer getId() {
        return this.Id;
    }

    /**
     * 设置漏洞ID。
     * @param Id 漏洞ID。
     */
    public void setId(Integer Id) {
        this.Id = Id;
    }

    /**
     * 获取站点ID。
     * @return SiteId 站点ID。
     */
    public Integer getSiteId() {
        return this.SiteId;
    }

    /**
     * 设置站点ID。
     * @param SiteId 站点ID。
     */
    public void setSiteId(Integer SiteId) {
        this.SiteId = SiteId;
    }

    /**
     * 获取扫描引擎的扫描任务ID。
     * @return TaskId 扫描引擎的扫描任务ID。
     */
    public Integer getTaskId() {
        return this.TaskId;
    }

    /**
     * 设置扫描引擎的扫描任务ID。
     * @param TaskId 扫描引擎的扫描任务ID。
     */
    public void setTaskId(Integer TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * 获取漏洞级别：high、middle、low、notice。
     * @return Level 漏洞级别：high、middle、low、notice。
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * 设置漏洞级别：high、middle、low、notice。
     * @param Level 漏洞级别：high、middle、low、notice。
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * 获取漏洞名称。
     * @return Name 漏洞名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置漏洞名称。
     * @param Name 漏洞名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取出现漏洞的url。
     * @return Url 出现漏洞的url。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * 设置出现漏洞的url。
     * @param Url 出现漏洞的url。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * 获取网址/细节。
     * @return Html 网址/细节。
     */
    public String getHtml() {
        return this.Html;
    }

    /**
     * 设置网址/细节。
     * @param Html 网址/细节。
     */
    public void setHtml(String Html) {
        this.Html = Html;
    }

    /**
     * 获取漏洞类型。
     * @return Nickname 漏洞类型。
     */
    public String getNickname() {
        return this.Nickname;
    }

    /**
     * 设置漏洞类型。
     * @param Nickname 漏洞类型。
     */
    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    /**
     * 获取危害说明。
     * @return Harm 危害说明。
     */
    public String getHarm() {
        return this.Harm;
    }

    /**
     * 设置危害说明。
     * @param Harm 危害说明。
     */
    public void setHarm(String Harm) {
        this.Harm = Harm;
    }

    /**
     * 获取漏洞描述。
     * @return Describe 漏洞描述。
     */
    public String getDescribe() {
        return this.Describe;
    }

    /**
     * 设置漏洞描述。
     * @param Describe 漏洞描述。
     */
    public void setDescribe(String Describe) {
        this.Describe = Describe;
    }

    /**
     * 获取解决方案。
     * @return Solution 解决方案。
     */
    public String getSolution() {
        return this.Solution;
    }

    /**
     * 设置解决方案。
     * @param Solution 解决方案。
     */
    public void setSolution(String Solution) {
        this.Solution = Solution;
    }

    /**
     * 获取漏洞参考。
     * @return From 漏洞参考。
     */
    public String getFrom() {
        return this.From;
    }

    /**
     * 设置漏洞参考。
     * @param From 漏洞参考。
     */
    public void setFrom(String From) {
        this.From = From;
    }

    /**
     * 获取漏洞通过该参数攻击。
     * @return Parameter 漏洞通过该参数攻击。
     */
    public String getParameter() {
        return this.Parameter;
    }

    /**
     * 设置漏洞通过该参数攻击。
     * @param Parameter 漏洞通过该参数攻击。
     */
    public void setParameter(String Parameter) {
        this.Parameter = Parameter;
    }

    /**
     * 获取CreatedAt。
     * @return CreatedAt CreatedAt。
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * 设置CreatedAt。
     * @param CreatedAt CreatedAt。
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * 获取UpdatedAt。
     * @return UpdatedAt UpdatedAt。
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * 设置UpdatedAt。
     * @param UpdatedAt UpdatedAt。
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsReported", this.IsReported);
        this.setParamSimple(map, prefix + "Appid", this.Appid);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "SiteId", this.SiteId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Html", this.Html);
        this.setParamSimple(map, prefix + "Nickname", this.Nickname);
        this.setParamSimple(map, prefix + "Harm", this.Harm);
        this.setParamSimple(map, prefix + "Describe", this.Describe);
        this.setParamSimple(map, prefix + "Solution", this.Solution);
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "Parameter", this.Parameter);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);

    }
}

