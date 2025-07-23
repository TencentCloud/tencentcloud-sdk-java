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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SwitchInfo extends AbstractModel {

    /**
    * 开启标识符 true代表开启
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * 获取日志状态失败时，返回错误信息
    */
    @SerializedName("ErrorMsg")
    @Expose
    private String ErrorMsg;

    /**
    * CLS日志集ID
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * 日志主题状态，opened表示已开启，opening开启中，closed表示已关闭，closing 表示关闭中
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * CLS日志主题ID
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * CLS日志主题所属region
    */
    @SerializedName("TopicRegion")
    @Expose
    private String TopicRegion;

    /**
    * 是否可升级
    */
    @SerializedName("UpgradeAble")
    @Expose
    private Boolean UpgradeAble;

    /**
    * 当前log-agent版本
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
     * Get 开启标识符 true代表开启 
     * @return Enable 开启标识符 true代表开启
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set 开启标识符 true代表开启
     * @param Enable 开启标识符 true代表开启
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 获取日志状态失败时，返回错误信息 
     * @return ErrorMsg 获取日志状态失败时，返回错误信息
     */
    public String getErrorMsg() {
        return this.ErrorMsg;
    }

    /**
     * Set 获取日志状态失败时，返回错误信息
     * @param ErrorMsg 获取日志状态失败时，返回错误信息
     */
    public void setErrorMsg(String ErrorMsg) {
        this.ErrorMsg = ErrorMsg;
    }

    /**
     * Get CLS日志集ID 
     * @return LogsetId CLS日志集ID
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set CLS日志集ID
     * @param LogsetId CLS日志集ID
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get 日志主题状态，opened表示已开启，opening开启中，closed表示已关闭，closing 表示关闭中 
     * @return Status 日志主题状态，opened表示已开启，opening开启中，closed表示已关闭，closing 表示关闭中
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 日志主题状态，opened表示已开启，opening开启中，closed表示已关闭，closing 表示关闭中
     * @param Status 日志主题状态，opened表示已开启，opening开启中，closed表示已关闭，closing 表示关闭中
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get CLS日志主题ID 
     * @return TopicId CLS日志主题ID
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set CLS日志主题ID
     * @param TopicId CLS日志主题ID
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get CLS日志主题所属region 
     * @return TopicRegion CLS日志主题所属region
     */
    public String getTopicRegion() {
        return this.TopicRegion;
    }

    /**
     * Set CLS日志主题所属region
     * @param TopicRegion CLS日志主题所属region
     */
    public void setTopicRegion(String TopicRegion) {
        this.TopicRegion = TopicRegion;
    }

    /**
     * Get 是否可升级 
     * @return UpgradeAble 是否可升级
     */
    public Boolean getUpgradeAble() {
        return this.UpgradeAble;
    }

    /**
     * Set 是否可升级
     * @param UpgradeAble 是否可升级
     */
    public void setUpgradeAble(Boolean UpgradeAble) {
        this.UpgradeAble = UpgradeAble;
    }

    /**
     * Get 当前log-agent版本 
     * @return Version 当前log-agent版本
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 当前log-agent版本
     * @param Version 当前log-agent版本
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    public SwitchInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SwitchInfo(SwitchInfo source) {
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.ErrorMsg != null) {
            this.ErrorMsg = new String(source.ErrorMsg);
        }
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.TopicRegion != null) {
            this.TopicRegion = new String(source.TopicRegion);
        }
        if (source.UpgradeAble != null) {
            this.UpgradeAble = new Boolean(source.UpgradeAble);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "ErrorMsg", this.ErrorMsg);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "TopicRegion", this.TopicRegion);
        this.setParamSimple(map, prefix + "UpgradeAble", this.UpgradeAble);
        this.setParamSimple(map, prefix + "Version", this.Version);

    }
}

