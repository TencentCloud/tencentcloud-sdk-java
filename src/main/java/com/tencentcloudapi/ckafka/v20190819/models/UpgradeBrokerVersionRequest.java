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
    * <p>ckafka集群实例Id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>版本升级类型</p><p>枚举值：</p><ul><li>1： 小版本迁移升级(推荐)</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>版本号</p>
    */
    @SerializedName("SourceVersion")
    @Expose
    private String SourceVersion;

    /**
    * <p>版本号</p>
    */
    @SerializedName("TargetVersion")
    @Expose
    private String TargetVersion;

    /**
    * <p>延迟时间</p>
    */
    @SerializedName("DelayTimeStamp")
    @Expose
    private String DelayTimeStamp;

    /**
     * Get <p>ckafka集群实例Id</p> 
     * @return InstanceId <p>ckafka集群实例Id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>ckafka集群实例Id</p>
     * @param InstanceId <p>ckafka集群实例Id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>版本升级类型</p><p>枚举值：</p><ul><li>1： 小版本迁移升级(推荐)</li></ul> 
     * @return Type <p>版本升级类型</p><p>枚举值：</p><ul><li>1： 小版本迁移升级(推荐)</li></ul>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>版本升级类型</p><p>枚举值：</p><ul><li>1： 小版本迁移升级(推荐)</li></ul>
     * @param Type <p>版本升级类型</p><p>枚举值：</p><ul><li>1： 小版本迁移升级(推荐)</li></ul>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>版本号</p> 
     * @return SourceVersion <p>版本号</p>
     */
    public String getSourceVersion() {
        return this.SourceVersion;
    }

    /**
     * Set <p>版本号</p>
     * @param SourceVersion <p>版本号</p>
     */
    public void setSourceVersion(String SourceVersion) {
        this.SourceVersion = SourceVersion;
    }

    /**
     * Get <p>版本号</p> 
     * @return TargetVersion <p>版本号</p>
     */
    public String getTargetVersion() {
        return this.TargetVersion;
    }

    /**
     * Set <p>版本号</p>
     * @param TargetVersion <p>版本号</p>
     */
    public void setTargetVersion(String TargetVersion) {
        this.TargetVersion = TargetVersion;
    }

    /**
     * Get <p>延迟时间</p> 
     * @return DelayTimeStamp <p>延迟时间</p>
     */
    public String getDelayTimeStamp() {
        return this.DelayTimeStamp;
    }

    /**
     * Set <p>延迟时间</p>
     * @param DelayTimeStamp <p>延迟时间</p>
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

