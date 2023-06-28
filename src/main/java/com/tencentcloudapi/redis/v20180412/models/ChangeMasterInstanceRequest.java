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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChangeMasterInstanceRequest extends AbstractModel{

    /**
    * 复制组ID。创建复制组时，系统自动分配的 ID，是复制组的唯一标识。例如：crs-rpl-m3zt****，请登录[Redis 控制台](https://console.cloud.tencent.com/redis/replication)的全球复制组列表获取复制组 ID。

    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 指定待提升为主实例的只读实例 ID。例如：crs-xjhsdj****。请登录[Redis控制台](https://console.cloud.tencent.com/redis)在实例列表复制实例 ID。


    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 标识是否强制提主。
- true：强制提主。
- false：不强制提主。
    */
    @SerializedName("ForceSwitch")
    @Expose
    private Boolean ForceSwitch;

    /**
     * Get 复制组ID。创建复制组时，系统自动分配的 ID，是复制组的唯一标识。例如：crs-rpl-m3zt****，请登录[Redis 控制台](https://console.cloud.tencent.com/redis/replication)的全球复制组列表获取复制组 ID。
 
     * @return GroupId 复制组ID。创建复制组时，系统自动分配的 ID，是复制组的唯一标识。例如：crs-rpl-m3zt****，请登录[Redis 控制台](https://console.cloud.tencent.com/redis/replication)的全球复制组列表获取复制组 ID。

     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 复制组ID。创建复制组时，系统自动分配的 ID，是复制组的唯一标识。例如：crs-rpl-m3zt****，请登录[Redis 控制台](https://console.cloud.tencent.com/redis/replication)的全球复制组列表获取复制组 ID。

     * @param GroupId 复制组ID。创建复制组时，系统自动分配的 ID，是复制组的唯一标识。例如：crs-rpl-m3zt****，请登录[Redis 控制台](https://console.cloud.tencent.com/redis/replication)的全球复制组列表获取复制组 ID。

     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 指定待提升为主实例的只读实例 ID。例如：crs-xjhsdj****。请登录[Redis控制台](https://console.cloud.tencent.com/redis)在实例列表复制实例 ID。

 
     * @return InstanceId 指定待提升为主实例的只读实例 ID。例如：crs-xjhsdj****。请登录[Redis控制台](https://console.cloud.tencent.com/redis)在实例列表复制实例 ID。


     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 指定待提升为主实例的只读实例 ID。例如：crs-xjhsdj****。请登录[Redis控制台](https://console.cloud.tencent.com/redis)在实例列表复制实例 ID。


     * @param InstanceId 指定待提升为主实例的只读实例 ID。例如：crs-xjhsdj****。请登录[Redis控制台](https://console.cloud.tencent.com/redis)在实例列表复制实例 ID。


     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 标识是否强制提主。
- true：强制提主。
- false：不强制提主。 
     * @return ForceSwitch 标识是否强制提主。
- true：强制提主。
- false：不强制提主。
     */
    public Boolean getForceSwitch() {
        return this.ForceSwitch;
    }

    /**
     * Set 标识是否强制提主。
- true：强制提主。
- false：不强制提主。
     * @param ForceSwitch 标识是否强制提主。
- true：强制提主。
- false：不强制提主。
     */
    public void setForceSwitch(Boolean ForceSwitch) {
        this.ForceSwitch = ForceSwitch;
    }

    public ChangeMasterInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChangeMasterInstanceRequest(ChangeMasterInstanceRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ForceSwitch != null) {
            this.ForceSwitch = new Boolean(source.ForceSwitch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ForceSwitch", this.ForceSwitch);

    }
}

