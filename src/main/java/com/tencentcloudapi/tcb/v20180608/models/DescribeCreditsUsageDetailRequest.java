/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCreditsUsageDetailRequest extends AbstractModel {

    /**
    * <p>模块列表</p><p>枚举值：</p><ul><li>FLEXDB： 文档数据库</li><li>TDSQL： MYSQL数据库</li><li>SCF： 云函数</li><li>AI： 大模型</li><li>EKS： 云托管</li><li>COS： 云存储</li><li>HOSTING： 静态托管</li><li>Auth： 用户权限</li><li>APIInvocation： API调用</li><li>HTTPInvocation： HTTP调用</li><li>VM： 主机</li><li>Workflow： 工作流</li><li>Other： 其他</li><li>PostgreSQL： PostgreSQL</li><li>Token： Token</li></ul>
    */
    @SerializedName("Modules")
    @Expose
    private String [] Modules;

    /**
    * <p>开始日期</p>
    */
    @SerializedName("StartDate")
    @Expose
    private String StartDate;

    /**
    * <p>结束日期</p>
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
    * <p>是否需要每日用量明细</p>
    */
    @SerializedName("NeedUsageDetails")
    @Expose
    private Boolean NeedUsageDetails;

    /**
    * <p>环境id</p>
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
     * Get <p>模块列表</p><p>枚举值：</p><ul><li>FLEXDB： 文档数据库</li><li>TDSQL： MYSQL数据库</li><li>SCF： 云函数</li><li>AI： 大模型</li><li>EKS： 云托管</li><li>COS： 云存储</li><li>HOSTING： 静态托管</li><li>Auth： 用户权限</li><li>APIInvocation： API调用</li><li>HTTPInvocation： HTTP调用</li><li>VM： 主机</li><li>Workflow： 工作流</li><li>Other： 其他</li><li>PostgreSQL： PostgreSQL</li><li>Token： Token</li></ul> 
     * @return Modules <p>模块列表</p><p>枚举值：</p><ul><li>FLEXDB： 文档数据库</li><li>TDSQL： MYSQL数据库</li><li>SCF： 云函数</li><li>AI： 大模型</li><li>EKS： 云托管</li><li>COS： 云存储</li><li>HOSTING： 静态托管</li><li>Auth： 用户权限</li><li>APIInvocation： API调用</li><li>HTTPInvocation： HTTP调用</li><li>VM： 主机</li><li>Workflow： 工作流</li><li>Other： 其他</li><li>PostgreSQL： PostgreSQL</li><li>Token： Token</li></ul>
     */
    public String [] getModules() {
        return this.Modules;
    }

    /**
     * Set <p>模块列表</p><p>枚举值：</p><ul><li>FLEXDB： 文档数据库</li><li>TDSQL： MYSQL数据库</li><li>SCF： 云函数</li><li>AI： 大模型</li><li>EKS： 云托管</li><li>COS： 云存储</li><li>HOSTING： 静态托管</li><li>Auth： 用户权限</li><li>APIInvocation： API调用</li><li>HTTPInvocation： HTTP调用</li><li>VM： 主机</li><li>Workflow： 工作流</li><li>Other： 其他</li><li>PostgreSQL： PostgreSQL</li><li>Token： Token</li></ul>
     * @param Modules <p>模块列表</p><p>枚举值：</p><ul><li>FLEXDB： 文档数据库</li><li>TDSQL： MYSQL数据库</li><li>SCF： 云函数</li><li>AI： 大模型</li><li>EKS： 云托管</li><li>COS： 云存储</li><li>HOSTING： 静态托管</li><li>Auth： 用户权限</li><li>APIInvocation： API调用</li><li>HTTPInvocation： HTTP调用</li><li>VM： 主机</li><li>Workflow： 工作流</li><li>Other： 其他</li><li>PostgreSQL： PostgreSQL</li><li>Token： Token</li></ul>
     */
    public void setModules(String [] Modules) {
        this.Modules = Modules;
    }

    /**
     * Get <p>开始日期</p> 
     * @return StartDate <p>开始日期</p>
     */
    public String getStartDate() {
        return this.StartDate;
    }

    /**
     * Set <p>开始日期</p>
     * @param StartDate <p>开始日期</p>
     */
    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    /**
     * Get <p>结束日期</p> 
     * @return EndDate <p>结束日期</p>
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set <p>结束日期</p>
     * @param EndDate <p>结束日期</p>
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    /**
     * Get <p>是否需要每日用量明细</p> 
     * @return NeedUsageDetails <p>是否需要每日用量明细</p>
     */
    public Boolean getNeedUsageDetails() {
        return this.NeedUsageDetails;
    }

    /**
     * Set <p>是否需要每日用量明细</p>
     * @param NeedUsageDetails <p>是否需要每日用量明细</p>
     */
    public void setNeedUsageDetails(Boolean NeedUsageDetails) {
        this.NeedUsageDetails = NeedUsageDetails;
    }

    /**
     * Get <p>环境id</p> 
     * @return EnvId <p>环境id</p>
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set <p>环境id</p>
     * @param EnvId <p>环境id</p>
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    public DescribeCreditsUsageDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCreditsUsageDetailRequest(DescribeCreditsUsageDetailRequest source) {
        if (source.Modules != null) {
            this.Modules = new String[source.Modules.length];
            for (int i = 0; i < source.Modules.length; i++) {
                this.Modules[i] = new String(source.Modules[i]);
            }
        }
        if (source.StartDate != null) {
            this.StartDate = new String(source.StartDate);
        }
        if (source.EndDate != null) {
            this.EndDate = new String(source.EndDate);
        }
        if (source.NeedUsageDetails != null) {
            this.NeedUsageDetails = new Boolean(source.NeedUsageDetails);
        }
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Modules.", this.Modules);
        this.setParamSimple(map, prefix + "StartDate", this.StartDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);
        this.setParamSimple(map, prefix + "NeedUsageDetails", this.NeedUsageDetails);
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);

    }
}

