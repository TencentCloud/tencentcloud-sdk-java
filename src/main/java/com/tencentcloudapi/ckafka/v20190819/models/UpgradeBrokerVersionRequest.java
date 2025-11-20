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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpgradeBrokerVersionRequest extends AbstractModel {

    /**
    * ckafka集群实例Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 1.平滑升配.2.垂直升配
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 版本号
    */
    @SerializedName("SourceVersion")
    @Expose
    private String SourceVersion;

    /**
    * 版本号
    */
    @SerializedName("TargetVersion")
    @Expose
    private String TargetVersion;

    /**
    * 延迟时间
    */
    @SerializedName("DelayTimeStamp")
    @Expose
    private String DelayTimeStamp;

    /**
     * Get ckafka集群实例Id 
     * @return InstanceId ckafka集群实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ckafka集群实例Id
     * @param InstanceId ckafka集群实例Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 1.平滑升配.2.垂直升配 
     * @return Type 1.平滑升配.2.垂直升配
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 1.平滑升配.2.垂直升配
     * @param Type 1.平滑升配.2.垂直升配
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 版本号 
     * @return SourceVersion 版本号
     */
    public String getSourceVersion() {
        return this.SourceVersion;
    }

    /**
     * Set 版本号
     * @param SourceVersion 版本号
     */
    public void setSourceVersion(String SourceVersion) {
        this.SourceVersion = SourceVersion;
    }

    /**
     * Get 版本号 
     * @return TargetVersion 版本号
     */
    public String getTargetVersion() {
        return this.TargetVersion;
    }

    /**
     * Set 版本号
     * @param TargetVersion 版本号
     */
    public void setTargetVersion(String TargetVersion) {
        this.TargetVersion = TargetVersion;
    }

    /**
     * Get 延迟时间 
     * @return DelayTimeStamp 延迟时间
     */
    public String getDelayTimeStamp() {
        return this.DelayTimeStamp;
    }

    /**
     * Set 延迟时间
     * @param DelayTimeStamp 延迟时间
     */
    public void setDelayTimeStamp(String DelayTimeStamp) {
        this.DelayTimeStamp = DelayTimeStamp;
    }

    public UpgradeBrokerVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradeBrokerVersionRequest(UpgradeBrokerVersionRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.SourceVersion != null) {
            this.SourceVersion = new String(source.SourceVersion);
        }
        if (source.TargetVersion != null) {
            this.TargetVersion = new String(source.TargetVersion);
        }
        if (source.DelayTimeStamp != null) {
            this.DelayTimeStamp = new String(source.DelayTimeStamp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "SourceVersion", this.SourceVersion);
        this.setParamSimple(map, prefix + "TargetVersion", this.TargetVersion);
        this.setParamSimple(map, prefix + "DelayTimeStamp", this.DelayTimeStamp);

    }
}

