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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EditVersions extends AbstractModel {

    /**
    * <p>版本号</p><p>取值范围：[0, 100]</p><p>默认值：0</p>
    */
    @SerializedName("Version")
    @Expose
    private Long Version;

    /**
    * <p>版本状态</p><p>枚举值：</p><ul><li>READY： 已完成</li><li>FAILED： 失败</li><li>PROCESSING： 进行中</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>是否是主版本</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul>
    */
    @SerializedName("IsMain")
    @Expose
    private Boolean IsMain;

    /**
    * <p>是否源头版本</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul>
    */
    @SerializedName("IsSource")
    @Expose
    private Boolean IsSource;

    /**
    * <p>版本时长</p><p>取值范围：[0, 1000000]</p><p>单位：秒</p>
    */
    @SerializedName("KeepDurationSec")
    @Expose
    private Long KeepDurationSec;

    /**
    * <p>创建时间</p><p>取值范围：[0, 10000000]</p>
    */
    @SerializedName("CreatedAtMs")
    @Expose
    private Long CreatedAtMs;

    /**
    * <p>创建用户id</p>
    */
    @SerializedName("CreatorUserId")
    @Expose
    private String CreatorUserId;

    /**
    * <p>失败原因</p><p>默认值：空</p><p>仅失败才会有原因</p>
    */
    @SerializedName("FailReason")
    @Expose
    private String FailReason;

    /**
    * <p>更新时间</p><p>取值范围：[0, 100000]</p>
    */
    @SerializedName("UpdatedAtMs")
    @Expose
    private Long UpdatedAtMs;

    /**
    * <p>版本名字</p>
    */
    @SerializedName("VersionName")
    @Expose
    private String VersionName;

    /**
     * Get <p>版本号</p><p>取值范围：[0, 100]</p><p>默认值：0</p> 
     * @return Version <p>版本号</p><p>取值范围：[0, 100]</p><p>默认值：0</p>
     */
    public Long getVersion() {
        return this.Version;
    }

    /**
     * Set <p>版本号</p><p>取值范围：[0, 100]</p><p>默认值：0</p>
     * @param Version <p>版本号</p><p>取值范围：[0, 100]</p><p>默认值：0</p>
     */
    public void setVersion(Long Version) {
        this.Version = Version;
    }

    /**
     * Get <p>版本状态</p><p>枚举值：</p><ul><li>READY： 已完成</li><li>FAILED： 失败</li><li>PROCESSING： 进行中</li></ul> 
     * @return Status <p>版本状态</p><p>枚举值：</p><ul><li>READY： 已完成</li><li>FAILED： 失败</li><li>PROCESSING： 进行中</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>版本状态</p><p>枚举值：</p><ul><li>READY： 已完成</li><li>FAILED： 失败</li><li>PROCESSING： 进行中</li></ul>
     * @param Status <p>版本状态</p><p>枚举值：</p><ul><li>READY： 已完成</li><li>FAILED： 失败</li><li>PROCESSING： 进行中</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>是否是主版本</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul> 
     * @return IsMain <p>是否是主版本</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul>
     */
    public Boolean getIsMain() {
        return this.IsMain;
    }

    /**
     * Set <p>是否是主版本</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul>
     * @param IsMain <p>是否是主版本</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul>
     */
    public void setIsMain(Boolean IsMain) {
        this.IsMain = IsMain;
    }

    /**
     * Get <p>是否源头版本</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul> 
     * @return IsSource <p>是否源头版本</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul>
     */
    public Boolean getIsSource() {
        return this.IsSource;
    }

    /**
     * Set <p>是否源头版本</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul>
     * @param IsSource <p>是否源头版本</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul>
     */
    public void setIsSource(Boolean IsSource) {
        this.IsSource = IsSource;
    }

    /**
     * Get <p>版本时长</p><p>取值范围：[0, 1000000]</p><p>单位：秒</p> 
     * @return KeepDurationSec <p>版本时长</p><p>取值范围：[0, 1000000]</p><p>单位：秒</p>
     */
    public Long getKeepDurationSec() {
        return this.KeepDurationSec;
    }

    /**
     * Set <p>版本时长</p><p>取值范围：[0, 1000000]</p><p>单位：秒</p>
     * @param KeepDurationSec <p>版本时长</p><p>取值范围：[0, 1000000]</p><p>单位：秒</p>
     */
    public void setKeepDurationSec(Long KeepDurationSec) {
        this.KeepDurationSec = KeepDurationSec;
    }

    /**
     * Get <p>创建时间</p><p>取值范围：[0, 10000000]</p> 
     * @return CreatedAtMs <p>创建时间</p><p>取值范围：[0, 10000000]</p>
     */
    public Long getCreatedAtMs() {
        return this.CreatedAtMs;
    }

    /**
     * Set <p>创建时间</p><p>取值范围：[0, 10000000]</p>
     * @param CreatedAtMs <p>创建时间</p><p>取值范围：[0, 10000000]</p>
     */
    public void setCreatedAtMs(Long CreatedAtMs) {
        this.CreatedAtMs = CreatedAtMs;
    }

    /**
     * Get <p>创建用户id</p> 
     * @return CreatorUserId <p>创建用户id</p>
     */
    public String getCreatorUserId() {
        return this.CreatorUserId;
    }

    /**
     * Set <p>创建用户id</p>
     * @param CreatorUserId <p>创建用户id</p>
     */
    public void setCreatorUserId(String CreatorUserId) {
        this.CreatorUserId = CreatorUserId;
    }

    /**
     * Get <p>失败原因</p><p>默认值：空</p><p>仅失败才会有原因</p> 
     * @return FailReason <p>失败原因</p><p>默认值：空</p><p>仅失败才会有原因</p>
     */
    public String getFailReason() {
        return this.FailReason;
    }

    /**
     * Set <p>失败原因</p><p>默认值：空</p><p>仅失败才会有原因</p>
     * @param FailReason <p>失败原因</p><p>默认值：空</p><p>仅失败才会有原因</p>
     */
    public void setFailReason(String FailReason) {
        this.FailReason = FailReason;
    }

    /**
     * Get <p>更新时间</p><p>取值范围：[0, 100000]</p> 
     * @return UpdatedAtMs <p>更新时间</p><p>取值范围：[0, 100000]</p>
     */
    public Long getUpdatedAtMs() {
        return this.UpdatedAtMs;
    }

    /**
     * Set <p>更新时间</p><p>取值范围：[0, 100000]</p>
     * @param UpdatedAtMs <p>更新时间</p><p>取值范围：[0, 100000]</p>
     */
    public void setUpdatedAtMs(Long UpdatedAtMs) {
        this.UpdatedAtMs = UpdatedAtMs;
    }

    /**
     * Get <p>版本名字</p> 
     * @return VersionName <p>版本名字</p>
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * Set <p>版本名字</p>
     * @param VersionName <p>版本名字</p>
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
    }

    public EditVersions() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EditVersions(EditVersions source) {
        if (source.Version != null) {
            this.Version = new Long(source.Version);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.IsMain != null) {
            this.IsMain = new Boolean(source.IsMain);
        }
        if (source.IsSource != null) {
            this.IsSource = new Boolean(source.IsSource);
        }
        if (source.KeepDurationSec != null) {
            this.KeepDurationSec = new Long(source.KeepDurationSec);
        }
        if (source.CreatedAtMs != null) {
            this.CreatedAtMs = new Long(source.CreatedAtMs);
        }
        if (source.CreatorUserId != null) {
            this.CreatorUserId = new String(source.CreatorUserId);
        }
        if (source.FailReason != null) {
            this.FailReason = new String(source.FailReason);
        }
        if (source.UpdatedAtMs != null) {
            this.UpdatedAtMs = new Long(source.UpdatedAtMs);
        }
        if (source.VersionName != null) {
            this.VersionName = new String(source.VersionName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "IsMain", this.IsMain);
        this.setParamSimple(map, prefix + "IsSource", this.IsSource);
        this.setParamSimple(map, prefix + "KeepDurationSec", this.KeepDurationSec);
        this.setParamSimple(map, prefix + "CreatedAtMs", this.CreatedAtMs);
        this.setParamSimple(map, prefix + "CreatorUserId", this.CreatorUserId);
        this.setParamSimple(map, prefix + "FailReason", this.FailReason);
        this.setParamSimple(map, prefix + "UpdatedAtMs", this.UpdatedAtMs);
        this.setParamSimple(map, prefix + "VersionName", this.VersionName);

    }
}

