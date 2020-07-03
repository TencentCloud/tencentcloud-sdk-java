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
package com.tencentcloudapi.solar.v20181011.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCustomersRequest extends AbstractModel{

    /**
    * 查询类型，0.个人，1负责部门，2.指定部门
    */
    @SerializedName("QueryType")
    @Expose
    private String QueryType;

    /**
    * 分组ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 是否星级标记 1是 0否
    */
    @SerializedName("MarkFlag")
    @Expose
    private Long MarkFlag;

    /**
    * 客户标签，多个标签用逗号隔开
    */
    @SerializedName("TagIds")
    @Expose
    private String TagIds;

    /**
    * 员工标识筛选，0：非员工，1：员工
    */
    @SerializedName("RelChannelFlag")
    @Expose
    private String RelChannelFlag;

    /**
    * 必须存在手机 1是 0否
    */
    @SerializedName("NeedPhoneFlag")
    @Expose
    private Long NeedPhoneFlag;

    /**
    * 省份
    */
    @SerializedName("Province")
    @Expose
    private String Province;

    /**
    * 城市
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * 性别 1男 2女
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * 城市
    */
    @SerializedName("KeyWord")
    @Expose
    private String KeyWord;

    /**
    * 查询开始位置
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页记录条数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 子项目ID
    */
    @SerializedName("SubProjectId")
    @Expose
    private String SubProjectId;

    /**
     * Get 查询类型，0.个人，1负责部门，2.指定部门 
     * @return QueryType 查询类型，0.个人，1负责部门，2.指定部门
     */
    public String getQueryType() {
        return this.QueryType;
    }

    /**
     * Set 查询类型，0.个人，1负责部门，2.指定部门
     * @param QueryType 查询类型，0.个人，1负责部门，2.指定部门
     */
    public void setQueryType(String QueryType) {
        this.QueryType = QueryType;
    }

    /**
     * Get 分组ID 
     * @return GroupId 分组ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 分组ID
     * @param GroupId 分组ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 是否星级标记 1是 0否 
     * @return MarkFlag 是否星级标记 1是 0否
     */
    public Long getMarkFlag() {
        return this.MarkFlag;
    }

    /**
     * Set 是否星级标记 1是 0否
     * @param MarkFlag 是否星级标记 1是 0否
     */
    public void setMarkFlag(Long MarkFlag) {
        this.MarkFlag = MarkFlag;
    }

    /**
     * Get 客户标签，多个标签用逗号隔开 
     * @return TagIds 客户标签，多个标签用逗号隔开
     */
    public String getTagIds() {
        return this.TagIds;
    }

    /**
     * Set 客户标签，多个标签用逗号隔开
     * @param TagIds 客户标签，多个标签用逗号隔开
     */
    public void setTagIds(String TagIds) {
        this.TagIds = TagIds;
    }

    /**
     * Get 员工标识筛选，0：非员工，1：员工 
     * @return RelChannelFlag 员工标识筛选，0：非员工，1：员工
     */
    public String getRelChannelFlag() {
        return this.RelChannelFlag;
    }

    /**
     * Set 员工标识筛选，0：非员工，1：员工
     * @param RelChannelFlag 员工标识筛选，0：非员工，1：员工
     */
    public void setRelChannelFlag(String RelChannelFlag) {
        this.RelChannelFlag = RelChannelFlag;
    }

    /**
     * Get 必须存在手机 1是 0否 
     * @return NeedPhoneFlag 必须存在手机 1是 0否
     */
    public Long getNeedPhoneFlag() {
        return this.NeedPhoneFlag;
    }

    /**
     * Set 必须存在手机 1是 0否
     * @param NeedPhoneFlag 必须存在手机 1是 0否
     */
    public void setNeedPhoneFlag(Long NeedPhoneFlag) {
        this.NeedPhoneFlag = NeedPhoneFlag;
    }

    /**
     * Get 省份 
     * @return Province 省份
     */
    public String getProvince() {
        return this.Province;
    }

    /**
     * Set 省份
     * @param Province 省份
     */
    public void setProvince(String Province) {
        this.Province = Province;
    }

    /**
     * Get 城市 
     * @return City 城市
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set 城市
     * @param City 城市
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get 性别 1男 2女 
     * @return Sex 性别 1男 2女
     */
    public String getSex() {
        return this.Sex;
    }

    /**
     * Set 性别 1男 2女
     * @param Sex 性别 1男 2女
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    /**
     * Get 城市 
     * @return KeyWord 城市
     */
    public String getKeyWord() {
        return this.KeyWord;
    }

    /**
     * Set 城市
     * @param KeyWord 城市
     */
    public void setKeyWord(String KeyWord) {
        this.KeyWord = KeyWord;
    }

    /**
     * Get 查询开始位置 
     * @return Offset 查询开始位置
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 查询开始位置
     * @param Offset 查询开始位置
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 每页记录条数 
     * @return Limit 每页记录条数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页记录条数
     * @param Limit 每页记录条数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 子项目ID 
     * @return SubProjectId 子项目ID
     */
    public String getSubProjectId() {
        return this.SubProjectId;
    }

    /**
     * Set 子项目ID
     * @param SubProjectId 子项目ID
     */
    public void setSubProjectId(String SubProjectId) {
        this.SubProjectId = SubProjectId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QueryType", this.QueryType);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "MarkFlag", this.MarkFlag);
        this.setParamSimple(map, prefix + "TagIds", this.TagIds);
        this.setParamSimple(map, prefix + "RelChannelFlag", this.RelChannelFlag);
        this.setParamSimple(map, prefix + "NeedPhoneFlag", this.NeedPhoneFlag);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "Sex", this.Sex);
        this.setParamSimple(map, prefix + "KeyWord", this.KeyWord);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "SubProjectId", this.SubProjectId);

    }
}

