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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AnchorContractInfo extends AbstractModel{

    /**
    * 主播ID
    */
    @SerializedName("AnchorId")
    @Expose
    private String AnchorId;

    /**
    * 主播名称
    */
    @SerializedName("AnchorName")
    @Expose
    private String AnchorName;

    /**
    * 代理商ID
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
    * 代理商名称
    */
    @SerializedName("AgentName")
    @Expose
    private String AgentName;

    /**
    * 主播身份证号
    */
    @SerializedName("IdNo")
    @Expose
    private String IdNo;

    /**
     * Get 主播ID 
     * @return AnchorId 主播ID
     */
    public String getAnchorId() {
        return this.AnchorId;
    }

    /**
     * Set 主播ID
     * @param AnchorId 主播ID
     */
    public void setAnchorId(String AnchorId) {
        this.AnchorId = AnchorId;
    }

    /**
     * Get 主播名称 
     * @return AnchorName 主播名称
     */
    public String getAnchorName() {
        return this.AnchorName;
    }

    /**
     * Set 主播名称
     * @param AnchorName 主播名称
     */
    public void setAnchorName(String AnchorName) {
        this.AnchorName = AnchorName;
    }

    /**
     * Get 代理商ID 
     * @return AgentId 代理商ID
     */
    public String getAgentId() {
        return this.AgentId;
    }

    /**
     * Set 代理商ID
     * @param AgentId 代理商ID
     */
    public void setAgentId(String AgentId) {
        this.AgentId = AgentId;
    }

    /**
     * Get 代理商名称 
     * @return AgentName 代理商名称
     */
    public String getAgentName() {
        return this.AgentName;
    }

    /**
     * Set 代理商名称
     * @param AgentName 代理商名称
     */
    public void setAgentName(String AgentName) {
        this.AgentName = AgentName;
    }

    /**
     * Get 主播身份证号 
     * @return IdNo 主播身份证号
     */
    public String getIdNo() {
        return this.IdNo;
    }

    /**
     * Set 主播身份证号
     * @param IdNo 主播身份证号
     */
    public void setIdNo(String IdNo) {
        this.IdNo = IdNo;
    }

    public AnchorContractInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AnchorContractInfo(AnchorContractInfo source) {
        if (source.AnchorId != null) {
            this.AnchorId = new String(source.AnchorId);
        }
        if (source.AnchorName != null) {
            this.AnchorName = new String(source.AnchorName);
        }
        if (source.AgentId != null) {
            this.AgentId = new String(source.AgentId);
        }
        if (source.AgentName != null) {
            this.AgentName = new String(source.AgentName);
        }
        if (source.IdNo != null) {
            this.IdNo = new String(source.IdNo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AnchorId", this.AnchorId);
        this.setParamSimple(map, prefix + "AnchorName", this.AnchorName);
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);
        this.setParamSimple(map, prefix + "AgentName", this.AgentName);
        this.setParamSimple(map, prefix + "IdNo", this.IdNo);

    }
}

