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
package com.tencentcloudapi.cr.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRecordsRequest extends AbstractModel{

    /**
    * 模块名，本接口取值：Record
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 操作名，本接口取值：List
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 产品ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 案件编号
    */
    @SerializedName("AccountNum")
    @Expose
    private String AccountNum;

    /**
    * 被叫号码
    */
    @SerializedName("CalledPhone")
    @Expose
    private String CalledPhone;

    /**
    * 查询起始日期，格式为YYYY-MM-DD
    */
    @SerializedName("StartBizDate")
    @Expose
    private String StartBizDate;

    /**
    * 查询结束日期，格式为YYYY-MM-DD
    */
    @SerializedName("EndBizDate")
    @Expose
    private String EndBizDate;

    /**
    * 分页参数，索引，默认为0
    */
    @SerializedName("Offset")
    @Expose
    private String Offset;

    /**
    * 分页参数，页长，默认为20
    */
    @SerializedName("Limit")
    @Expose
    private String Limit;

    /**
    * 实例ID，不传默认为系统分配的初始实例
    */
    @SerializedName("InstId")
    @Expose
    private String InstId;

    /**
     * Get 模块名，本接口取值：Record 
     * @return Module 模块名，本接口取值：Record
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 模块名，本接口取值：Record
     * @param Module 模块名，本接口取值：Record
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 操作名，本接口取值：List 
     * @return Operation 操作名，本接口取值：List
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 操作名，本接口取值：List
     * @param Operation 操作名，本接口取值：List
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get 产品ID 
     * @return ProductId 产品ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品ID
     * @param ProductId 产品ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 案件编号 
     * @return AccountNum 案件编号
     */
    public String getAccountNum() {
        return this.AccountNum;
    }

    /**
     * Set 案件编号
     * @param AccountNum 案件编号
     */
    public void setAccountNum(String AccountNum) {
        this.AccountNum = AccountNum;
    }

    /**
     * Get 被叫号码 
     * @return CalledPhone 被叫号码
     */
    public String getCalledPhone() {
        return this.CalledPhone;
    }

    /**
     * Set 被叫号码
     * @param CalledPhone 被叫号码
     */
    public void setCalledPhone(String CalledPhone) {
        this.CalledPhone = CalledPhone;
    }

    /**
     * Get 查询起始日期，格式为YYYY-MM-DD 
     * @return StartBizDate 查询起始日期，格式为YYYY-MM-DD
     */
    public String getStartBizDate() {
        return this.StartBizDate;
    }

    /**
     * Set 查询起始日期，格式为YYYY-MM-DD
     * @param StartBizDate 查询起始日期，格式为YYYY-MM-DD
     */
    public void setStartBizDate(String StartBizDate) {
        this.StartBizDate = StartBizDate;
    }

    /**
     * Get 查询结束日期，格式为YYYY-MM-DD 
     * @return EndBizDate 查询结束日期，格式为YYYY-MM-DD
     */
    public String getEndBizDate() {
        return this.EndBizDate;
    }

    /**
     * Set 查询结束日期，格式为YYYY-MM-DD
     * @param EndBizDate 查询结束日期，格式为YYYY-MM-DD
     */
    public void setEndBizDate(String EndBizDate) {
        this.EndBizDate = EndBizDate;
    }

    /**
     * Get 分页参数，索引，默认为0 
     * @return Offset 分页参数，索引，默认为0
     */
    public String getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页参数，索引，默认为0
     * @param Offset 分页参数，索引，默认为0
     */
    public void setOffset(String Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页参数，页长，默认为20 
     * @return Limit 分页参数，页长，默认为20
     */
    public String getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页参数，页长，默认为20
     * @param Limit 分页参数，页长，默认为20
     */
    public void setLimit(String Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 实例ID，不传默认为系统分配的初始实例 
     * @return InstId 实例ID，不传默认为系统分配的初始实例
     */
    public String getInstId() {
        return this.InstId;
    }

    /**
     * Set 实例ID，不传默认为系统分配的初始实例
     * @param InstId 实例ID，不传默认为系统分配的初始实例
     */
    public void setInstId(String InstId) {
        this.InstId = InstId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "AccountNum", this.AccountNum);
        this.setParamSimple(map, prefix + "CalledPhone", this.CalledPhone);
        this.setParamSimple(map, prefix + "StartBizDate", this.StartBizDate);
        this.setParamSimple(map, prefix + "EndBizDate", this.EndBizDate);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "InstId", this.InstId);

    }
}

