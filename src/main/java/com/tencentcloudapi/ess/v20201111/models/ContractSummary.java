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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ContractSummary extends AbstractModel {

    /**
    * 提取内容分类：
Base 合同信息
Identity 主体信息
Performance 履约条款
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 详细信息
    */
    @SerializedName("Infos")
    @Expose
    private ContractSummaryInfo [] Infos;

    /**
     * Get 提取内容分类：
Base 合同信息
Identity 主体信息
Performance 履约条款 
     * @return Name 提取内容分类：
Base 合同信息
Identity 主体信息
Performance 履约条款
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 提取内容分类：
Base 合同信息
Identity 主体信息
Performance 履约条款
     * @param Name 提取内容分类：
Base 合同信息
Identity 主体信息
Performance 履约条款
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 详细信息 
     * @return Infos 详细信息
     */
    public ContractSummaryInfo [] getInfos() {
        return this.Infos;
    }

    /**
     * Set 详细信息
     * @param Infos 详细信息
     */
    public void setInfos(ContractSummaryInfo [] Infos) {
        this.Infos = Infos;
    }

    public ContractSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContractSummary(ContractSummary source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Infos != null) {
            this.Infos = new ContractSummaryInfo[source.Infos.length];
            for (int i = 0; i < source.Infos.length; i++) {
                this.Infos[i] = new ContractSummaryInfo(source.Infos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "Infos.", this.Infos);

    }
}

