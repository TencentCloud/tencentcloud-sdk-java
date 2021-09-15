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
package com.tencentcloudapi.essbasic.v20201222.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSignUrlRequest extends AbstractModel{

    /**
    * 调用方信息
    */
    @SerializedName("Caller")
    @Expose
    private Caller Caller;

    /**
    * 签署人ID
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 文件签署截止时间戳
    */
    @SerializedName("Deadline")
    @Expose
    private Long Deadline;

    /**
    * 目录ID。当 SignUrlType 为 CATALOG 时必填
    */
    @SerializedName("CatalogId")
    @Expose
    private String CatalogId;

    /**
    * 流程ID。当 SignUrlType 为 FLOW 时必填
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * 签署链接类型：
1. FLOW - 单流程签署 (默认) 
2. CATALOG - 目录签署
    */
    @SerializedName("SignUrlType")
    @Expose
    private String SignUrlType;

    /**
    * 发送流程或目录时生成的签署任务ID
    */
    @SerializedName("SignId")
    @Expose
    private String SignId;

    /**
     * Get 调用方信息 
     * @return Caller 调用方信息
     */
    public Caller getCaller() {
        return this.Caller;
    }

    /**
     * Set 调用方信息
     * @param Caller 调用方信息
     */
    public void setCaller(Caller Caller) {
        this.Caller = Caller;
    }

    /**
     * Get 签署人ID 
     * @return UserId 签署人ID
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 签署人ID
     * @param UserId 签署人ID
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 文件签署截止时间戳 
     * @return Deadline 文件签署截止时间戳
     */
    public Long getDeadline() {
        return this.Deadline;
    }

    /**
     * Set 文件签署截止时间戳
     * @param Deadline 文件签署截止时间戳
     */
    public void setDeadline(Long Deadline) {
        this.Deadline = Deadline;
    }

    /**
     * Get 目录ID。当 SignUrlType 为 CATALOG 时必填 
     * @return CatalogId 目录ID。当 SignUrlType 为 CATALOG 时必填
     */
    public String getCatalogId() {
        return this.CatalogId;
    }

    /**
     * Set 目录ID。当 SignUrlType 为 CATALOG 时必填
     * @param CatalogId 目录ID。当 SignUrlType 为 CATALOG 时必填
     */
    public void setCatalogId(String CatalogId) {
        this.CatalogId = CatalogId;
    }

    /**
     * Get 流程ID。当 SignUrlType 为 FLOW 时必填 
     * @return FlowId 流程ID。当 SignUrlType 为 FLOW 时必填
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 流程ID。当 SignUrlType 为 FLOW 时必填
     * @param FlowId 流程ID。当 SignUrlType 为 FLOW 时必填
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get 签署链接类型：
1. FLOW - 单流程签署 (默认) 
2. CATALOG - 目录签署 
     * @return SignUrlType 签署链接类型：
1. FLOW - 单流程签署 (默认) 
2. CATALOG - 目录签署
     */
    public String getSignUrlType() {
        return this.SignUrlType;
    }

    /**
     * Set 签署链接类型：
1. FLOW - 单流程签署 (默认) 
2. CATALOG - 目录签署
     * @param SignUrlType 签署链接类型：
1. FLOW - 单流程签署 (默认) 
2. CATALOG - 目录签署
     */
    public void setSignUrlType(String SignUrlType) {
        this.SignUrlType = SignUrlType;
    }

    /**
     * Get 发送流程或目录时生成的签署任务ID 
     * @return SignId 发送流程或目录时生成的签署任务ID
     */
    public String getSignId() {
        return this.SignId;
    }

    /**
     * Set 发送流程或目录时生成的签署任务ID
     * @param SignId 发送流程或目录时生成的签署任务ID
     */
    public void setSignId(String SignId) {
        this.SignId = SignId;
    }

    public CreateSignUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSignUrlRequest(CreateSignUrlRequest source) {
        if (source.Caller != null) {
            this.Caller = new Caller(source.Caller);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.Deadline != null) {
            this.Deadline = new Long(source.Deadline);
        }
        if (source.CatalogId != null) {
            this.CatalogId = new String(source.CatalogId);
        }
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.SignUrlType != null) {
            this.SignUrlType = new String(source.SignUrlType);
        }
        if (source.SignId != null) {
            this.SignId = new String(source.SignId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Caller.", this.Caller);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "Deadline", this.Deadline);
        this.setParamSimple(map, prefix + "CatalogId", this.CatalogId);
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamSimple(map, prefix + "SignUrlType", this.SignUrlType);
        this.setParamSimple(map, prefix + "SignId", this.SignId);

    }
}

