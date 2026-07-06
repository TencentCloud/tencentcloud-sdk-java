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

public class ModifyDspmAssetDataScanTaskRequest extends AbstractModel {

    /**
    * 实例id
    */
    @SerializedName("AssetIds")
    @Expose
    private String [] AssetIds;

    /**
    * 是否定时任务
    */
    @SerializedName("IsScheduled")
    @Expose
    private Boolean IsScheduled;

    /**
    * 是否同意一键授权
    */
    @SerializedName("IsAgreeAuth")
    @Expose
    private Boolean IsAgreeAuth;

    /**
    * 是否立即执行
    */
    @SerializedName("IsRunAtOnce")
    @Expose
    private Boolean IsRunAtOnce;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * 调度周期配置
    */
    @SerializedName("ScheduleConfig")
    @Expose
    private DspmScheduleConfig ScheduleConfig;

    /**
     * Get 实例id 
     * @return AssetIds 实例id
     */
    public String [] getAssetIds() {
        return this.AssetIds;
    }

    /**
     * Set 实例id
     * @param AssetIds 实例id
     */
    public void setAssetIds(String [] AssetIds) {
        this.AssetIds = AssetIds;
    }

    /**
     * Get 是否定时任务 
     * @return IsScheduled 是否定时任务
     */
    public Boolean getIsScheduled() {
        return this.IsScheduled;
    }

    /**
     * Set 是否定时任务
     * @param IsScheduled 是否定时任务
     */
    public void setIsScheduled(Boolean IsScheduled) {
        this.IsScheduled = IsScheduled;
    }

    /**
     * Get 是否同意一键授权 
     * @return IsAgreeAuth 是否同意一键授权
     */
    public Boolean getIsAgreeAuth() {
        return this.IsAgreeAuth;
    }

    /**
     * Set 是否同意一键授权
     * @param IsAgreeAuth 是否同意一键授权
     */
    public void setIsAgreeAuth(Boolean IsAgreeAuth) {
        this.IsAgreeAuth = IsAgreeAuth;
    }

    /**
     * Get 是否立即执行 
     * @return IsRunAtOnce 是否立即执行
     */
    public Boolean getIsRunAtOnce() {
        return this.IsRunAtOnce;
    }

    /**
     * Set 是否立即执行
     * @param IsRunAtOnce 是否立即执行
     */
    public void setIsRunAtOnce(Boolean IsRunAtOnce) {
        this.IsRunAtOnce = IsRunAtOnce;
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

    /**
     * Get 调度周期配置 
     * @return ScheduleConfig 调度周期配置
     */
    public DspmScheduleConfig getScheduleConfig() {
        return this.ScheduleConfig;
    }

    /**
     * Set 调度周期配置
     * @param ScheduleConfig 调度周期配置
     */
    public void setScheduleConfig(DspmScheduleConfig ScheduleConfig) {
        this.ScheduleConfig = ScheduleConfig;
    }

    public ModifyDspmAssetDataScanTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDspmAssetDataScanTaskRequest(ModifyDspmAssetDataScanTaskRequest source) {
        if (source.AssetIds != null) {
            this.AssetIds = new String[source.AssetIds.length];
            for (int i = 0; i < source.AssetIds.length; i++) {
                this.AssetIds[i] = new String(source.AssetIds[i]);
            }
        }
        if (source.IsScheduled != null) {
            this.IsScheduled = new Boolean(source.IsScheduled);
        }
        if (source.IsAgreeAuth != null) {
            this.IsAgreeAuth = new Boolean(source.IsAgreeAuth);
        }
        if (source.IsRunAtOnce != null) {
            this.IsRunAtOnce = new Boolean(source.IsRunAtOnce);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.ScheduleConfig != null) {
            this.ScheduleConfig = new DspmScheduleConfig(source.ScheduleConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AssetIds.", this.AssetIds);
        this.setParamSimple(map, prefix + "IsScheduled", this.IsScheduled);
        this.setParamSimple(map, prefix + "IsAgreeAuth", this.IsAgreeAuth);
        this.setParamSimple(map, prefix + "IsRunAtOnce", this.IsRunAtOnce);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamObj(map, prefix + "ScheduleConfig.", this.ScheduleConfig);

    }
}

