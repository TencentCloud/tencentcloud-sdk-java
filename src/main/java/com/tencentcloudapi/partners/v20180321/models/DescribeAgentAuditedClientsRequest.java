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
package com.tencentcloudapi.partners.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAgentAuditedClientsRequest extends AbstractModel{

    /**
    * 客户账号ID
    */
    @SerializedName("ClientUin")
    @Expose
    private String ClientUin;

    /**
    * 客户名称。由于涉及隐私，名称打码显示，故名称仅支持打码后的模糊搜索
    */
    @SerializedName("ClientName")
    @Expose
    private String ClientName;

    /**
    * 客户类型，a/b，类型定义参考代理商相关政策文档
    */
    @SerializedName("ClientFlag")
    @Expose
    private String ClientFlag;

    /**
    * ASC/DESC， 不区分大小写，按审核通过时间排序
    */
    @SerializedName("OrderDirection")
    @Expose
    private String OrderDirection;

    /**
    * 客户账号ID列表
    */
    @SerializedName("ClientUins")
    @Expose
    private String [] ClientUins;

    /**
    * 是否欠费。0：不欠费；1：欠费
    */
    @SerializedName("HasOverdueBill")
    @Expose
    private Long HasOverdueBill;

    /**
    * 客户备注
    */
    @SerializedName("ClientRemark")
    @Expose
    private String ClientRemark;

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 限制数目
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 客户类型：可以为new(新拓)/assign(指定)/old(存量)/空
    */
    @SerializedName("ClientType")
    @Expose
    private String ClientType;

    /**
    * 项目类型：可以为self(自拓项目)/platform(合作项目)/repeat(复算项目  )/空
    */
    @SerializedName("ProjectType")
    @Expose
    private String ProjectType;

    /**
    * 业务员ID
    */
    @SerializedName("SalesUin")
    @Expose
    private String SalesUin;

    /**
    * 业务员姓名（模糊查询）
    */
    @SerializedName("SalesName")
    @Expose
    private String SalesName;

    /**
     * Get 客户账号ID 
     * @return ClientUin 客户账号ID
     */
    public String getClientUin() {
        return this.ClientUin;
    }

    /**
     * Set 客户账号ID
     * @param ClientUin 客户账号ID
     */
    public void setClientUin(String ClientUin) {
        this.ClientUin = ClientUin;
    }

    /**
     * Get 客户名称。由于涉及隐私，名称打码显示，故名称仅支持打码后的模糊搜索 
     * @return ClientName 客户名称。由于涉及隐私，名称打码显示，故名称仅支持打码后的模糊搜索
     */
    public String getClientName() {
        return this.ClientName;
    }

    /**
     * Set 客户名称。由于涉及隐私，名称打码显示，故名称仅支持打码后的模糊搜索
     * @param ClientName 客户名称。由于涉及隐私，名称打码显示，故名称仅支持打码后的模糊搜索
     */
    public void setClientName(String ClientName) {
        this.ClientName = ClientName;
    }

    /**
     * Get 客户类型，a/b，类型定义参考代理商相关政策文档 
     * @return ClientFlag 客户类型，a/b，类型定义参考代理商相关政策文档
     */
    public String getClientFlag() {
        return this.ClientFlag;
    }

    /**
     * Set 客户类型，a/b，类型定义参考代理商相关政策文档
     * @param ClientFlag 客户类型，a/b，类型定义参考代理商相关政策文档
     */
    public void setClientFlag(String ClientFlag) {
        this.ClientFlag = ClientFlag;
    }

    /**
     * Get ASC/DESC， 不区分大小写，按审核通过时间排序 
     * @return OrderDirection ASC/DESC， 不区分大小写，按审核通过时间排序
     */
    public String getOrderDirection() {
        return this.OrderDirection;
    }

    /**
     * Set ASC/DESC， 不区分大小写，按审核通过时间排序
     * @param OrderDirection ASC/DESC， 不区分大小写，按审核通过时间排序
     */
    public void setOrderDirection(String OrderDirection) {
        this.OrderDirection = OrderDirection;
    }

    /**
     * Get 客户账号ID列表 
     * @return ClientUins 客户账号ID列表
     */
    public String [] getClientUins() {
        return this.ClientUins;
    }

    /**
     * Set 客户账号ID列表
     * @param ClientUins 客户账号ID列表
     */
    public void setClientUins(String [] ClientUins) {
        this.ClientUins = ClientUins;
    }

    /**
     * Get 是否欠费。0：不欠费；1：欠费 
     * @return HasOverdueBill 是否欠费。0：不欠费；1：欠费
     */
    public Long getHasOverdueBill() {
        return this.HasOverdueBill;
    }

    /**
     * Set 是否欠费。0：不欠费；1：欠费
     * @param HasOverdueBill 是否欠费。0：不欠费；1：欠费
     */
    public void setHasOverdueBill(Long HasOverdueBill) {
        this.HasOverdueBill = HasOverdueBill;
    }

    /**
     * Get 客户备注 
     * @return ClientRemark 客户备注
     */
    public String getClientRemark() {
        return this.ClientRemark;
    }

    /**
     * Set 客户备注
     * @param ClientRemark 客户备注
     */
    public void setClientRemark(String ClientRemark) {
        this.ClientRemark = ClientRemark;
    }

    /**
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 限制数目 
     * @return Limit 限制数目
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 限制数目
     * @param Limit 限制数目
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 客户类型：可以为new(新拓)/assign(指定)/old(存量)/空 
     * @return ClientType 客户类型：可以为new(新拓)/assign(指定)/old(存量)/空
     */
    public String getClientType() {
        return this.ClientType;
    }

    /**
     * Set 客户类型：可以为new(新拓)/assign(指定)/old(存量)/空
     * @param ClientType 客户类型：可以为new(新拓)/assign(指定)/old(存量)/空
     */
    public void setClientType(String ClientType) {
        this.ClientType = ClientType;
    }

    /**
     * Get 项目类型：可以为self(自拓项目)/platform(合作项目)/repeat(复算项目  )/空 
     * @return ProjectType 项目类型：可以为self(自拓项目)/platform(合作项目)/repeat(复算项目  )/空
     */
    public String getProjectType() {
        return this.ProjectType;
    }

    /**
     * Set 项目类型：可以为self(自拓项目)/platform(合作项目)/repeat(复算项目  )/空
     * @param ProjectType 项目类型：可以为self(自拓项目)/platform(合作项目)/repeat(复算项目  )/空
     */
    public void setProjectType(String ProjectType) {
        this.ProjectType = ProjectType;
    }

    /**
     * Get 业务员ID 
     * @return SalesUin 业务员ID
     */
    public String getSalesUin() {
        return this.SalesUin;
    }

    /**
     * Set 业务员ID
     * @param SalesUin 业务员ID
     */
    public void setSalesUin(String SalesUin) {
        this.SalesUin = SalesUin;
    }

    /**
     * Get 业务员姓名（模糊查询） 
     * @return SalesName 业务员姓名（模糊查询）
     */
    public String getSalesName() {
        return this.SalesName;
    }

    /**
     * Set 业务员姓名（模糊查询）
     * @param SalesName 业务员姓名（模糊查询）
     */
    public void setSalesName(String SalesName) {
        this.SalesName = SalesName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClientUin", this.ClientUin);
        this.setParamSimple(map, prefix + "ClientName", this.ClientName);
        this.setParamSimple(map, prefix + "ClientFlag", this.ClientFlag);
        this.setParamSimple(map, prefix + "OrderDirection", this.OrderDirection);
        this.setParamArraySimple(map, prefix + "ClientUins.", this.ClientUins);
        this.setParamSimple(map, prefix + "HasOverdueBill", this.HasOverdueBill);
        this.setParamSimple(map, prefix + "ClientRemark", this.ClientRemark);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "ClientType", this.ClientType);
        this.setParamSimple(map, prefix + "ProjectType", this.ProjectType);
        this.setParamSimple(map, prefix + "SalesUin", this.SalesUin);
        this.setParamSimple(map, prefix + "SalesName", this.SalesName);

    }
}

