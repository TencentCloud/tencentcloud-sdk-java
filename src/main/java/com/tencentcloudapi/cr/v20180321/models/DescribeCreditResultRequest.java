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

public class DescribeCreditResultRequest  extends AbstractModel{

    /**
    * 模块
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 操作
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 实例ID
    */
    @SerializedName("InstId")
    @Expose
    private String InstId;

    /**
    * 产品ID，形如P******。
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 信审任务ID
    */
    @SerializedName("CaseId")
    @Expose
    private String CaseId;

    /**
    * 请求日期
    */
    @SerializedName("RequestDate")
    @Expose
    private String RequestDate;

    /**
     * 获取模块
     * @return Module 模块
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * 设置模块
     * @param Module 模块
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * 获取操作
     * @return Operation 操作
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * 设置操作
     * @param Operation 操作
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * 获取实例ID
     * @return InstId 实例ID
     */
    public String getInstId() {
        return this.InstId;
    }

    /**
     * 设置实例ID
     * @param InstId 实例ID
     */
    public void setInstId(String InstId) {
        this.InstId = InstId;
    }

    /**
     * 获取产品ID，形如P******。
     * @return ProductId 产品ID，形如P******。
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * 设置产品ID，形如P******。
     * @param ProductId 产品ID，形如P******。
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * 获取信审任务ID
     * @return CaseId 信审任务ID
     */
    public String getCaseId() {
        return this.CaseId;
    }

    /**
     * 设置信审任务ID
     * @param CaseId 信审任务ID
     */
    public void setCaseId(String CaseId) {
        this.CaseId = CaseId;
    }

    /**
     * 获取请求日期
     * @return RequestDate 请求日期
     */
    public String getRequestDate() {
        return this.RequestDate;
    }

    /**
     * 设置请求日期
     * @param RequestDate 请求日期
     */
    public void setRequestDate(String RequestDate) {
        this.RequestDate = RequestDate;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "InstId", this.InstId);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "CaseId", this.CaseId);
        this.setParamSimple(map, prefix + "RequestDate", this.RequestDate);

    }
}

