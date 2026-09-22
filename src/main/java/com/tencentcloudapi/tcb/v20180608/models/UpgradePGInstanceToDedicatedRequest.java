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

public class UpgradePGInstanceToDedicatedRequest extends AbstractModel {

    /**
    * <p>云开发环境ID</p>
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * <p>切换时机</p><p>枚举值：</p><ul><li>0： 立即切换</li><li>1： 指定时间切换</li></ul>
    */
    @SerializedName("SwitchTag")
    @Expose
    private Long SwitchTag;

    /**
    * <p>切换开始时间</p><p>参数格式：15:04:05</p>
    */
    @SerializedName("SwitchStartTime")
    @Expose
    private String SwitchStartTime;

    /**
    * <p>切换结束时间</p><p>参数格式：15:04:05</p>
    */
    @SerializedName("SwitchEndTime")
    @Expose
    private String SwitchEndTime;

    /**
    * <p>PG 规格</p>
    */
    @SerializedName("SpecCode")
    @Expose
    private String SpecCode;

    /**
    * <p>存储空间大小</p>
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
     * Get <p>云开发环境ID</p> 
     * @return EnvId <p>云开发环境ID</p>
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set <p>云开发环境ID</p>
     * @param EnvId <p>云开发环境ID</p>
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get <p>切换时机</p><p>枚举值：</p><ul><li>0： 立即切换</li><li>1： 指定时间切换</li></ul> 
     * @return SwitchTag <p>切换时机</p><p>枚举值：</p><ul><li>0： 立即切换</li><li>1： 指定时间切换</li></ul>
     */
    public Long getSwitchTag() {
        return this.SwitchTag;
    }

    /**
     * Set <p>切换时机</p><p>枚举值：</p><ul><li>0： 立即切换</li><li>1： 指定时间切换</li></ul>
     * @param SwitchTag <p>切换时机</p><p>枚举值：</p><ul><li>0： 立即切换</li><li>1： 指定时间切换</li></ul>
     */
    public void setSwitchTag(Long SwitchTag) {
        this.SwitchTag = SwitchTag;
    }

    /**
     * Get <p>切换开始时间</p><p>参数格式：15:04:05</p> 
     * @return SwitchStartTime <p>切换开始时间</p><p>参数格式：15:04:05</p>
     */
    public String getSwitchStartTime() {
        return this.SwitchStartTime;
    }

    /**
     * Set <p>切换开始时间</p><p>参数格式：15:04:05</p>
     * @param SwitchStartTime <p>切换开始时间</p><p>参数格式：15:04:05</p>
     */
    public void setSwitchStartTime(String SwitchStartTime) {
        this.SwitchStartTime = SwitchStartTime;
    }

    /**
     * Get <p>切换结束时间</p><p>参数格式：15:04:05</p> 
     * @return SwitchEndTime <p>切换结束时间</p><p>参数格式：15:04:05</p>
     */
    public String getSwitchEndTime() {
        return this.SwitchEndTime;
    }

    /**
     * Set <p>切换结束时间</p><p>参数格式：15:04:05</p>
     * @param SwitchEndTime <p>切换结束时间</p><p>参数格式：15:04:05</p>
     */
    public void setSwitchEndTime(String SwitchEndTime) {
        this.SwitchEndTime = SwitchEndTime;
    }

    /**
     * Get <p>PG 规格</p> 
     * @return SpecCode <p>PG 规格</p>
     */
    public String getSpecCode() {
        return this.SpecCode;
    }

    /**
     * Set <p>PG 规格</p>
     * @param SpecCode <p>PG 规格</p>
     */
    public void setSpecCode(String SpecCode) {
        this.SpecCode = SpecCode;
    }

    /**
     * Get <p>存储空间大小</p> 
     * @return Storage <p>存储空间大小</p>
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set <p>存储空间大小</p>
     * @param Storage <p>存储空间大小</p>
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    public UpgradePGInstanceToDedicatedRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradePGInstanceToDedicatedRequest(UpgradePGInstanceToDedicatedRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.SwitchTag != null) {
            this.SwitchTag = new Long(source.SwitchTag);
        }
        if (source.SwitchStartTime != null) {
            this.SwitchStartTime = new String(source.SwitchStartTime);
        }
        if (source.SwitchEndTime != null) {
            this.SwitchEndTime = new String(source.SwitchEndTime);
        }
        if (source.SpecCode != null) {
            this.SpecCode = new String(source.SpecCode);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "SwitchTag", this.SwitchTag);
        this.setParamSimple(map, prefix + "SwitchStartTime", this.SwitchStartTime);
        this.setParamSimple(map, prefix + "SwitchEndTime", this.SwitchEndTime);
        this.setParamSimple(map, prefix + "SpecCode", this.SpecCode);
        this.setParamSimple(map, prefix + "Storage", this.Storage);

    }
}

