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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyEdrAlertStatusRequest extends AbstractModel {

    /**
    * <p>目标告警信息</p>
    */
    @SerializedName("Targets")
    @Expose
    private EdrAlertTarget [] Targets;

    /**
    * <p>想达到的告警状态枚举值：PROCESSED： 已处理WHITELISTED： 已加白IGNORED： 已忽略DELETED： 已删除-软删除</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
     * Get <p>目标告警信息</p> 
     * @return Targets <p>目标告警信息</p>
     */
    public EdrAlertTarget [] getTargets() {
        return this.Targets;
    }

    /**
     * Set <p>目标告警信息</p>
     * @param Targets <p>目标告警信息</p>
     */
    public void setTargets(EdrAlertTarget [] Targets) {
        this.Targets = Targets;
    }

    /**
     * Get <p>想达到的告警状态枚举值：PROCESSED： 已处理WHITELISTED： 已加白IGNORED： 已忽略DELETED： 已删除-软删除</p> 
     * @return Status <p>想达到的告警状态枚举值：PROCESSED： 已处理WHITELISTED： 已加白IGNORED： 已忽略DELETED： 已删除-软删除</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>想达到的告警状态枚举值：PROCESSED： 已处理WHITELISTED： 已加白IGNORED： 已忽略DELETED： 已删除-软删除</p>
     * @param Status <p>想达到的告警状态枚举值：PROCESSED： 已处理WHITELISTED： 已加白IGNORED： 已忽略DELETED： 已删除-软删除</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    public ModifyEdrAlertStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyEdrAlertStatusRequest(ModifyEdrAlertStatusRequest source) {
        if (source.Targets != null) {
            this.Targets = new EdrAlertTarget[source.Targets.length];
            for (int i = 0; i < source.Targets.length; i++) {
                this.Targets[i] = new EdrAlertTarget(source.Targets[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Targets.", this.Targets);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);

    }
}

