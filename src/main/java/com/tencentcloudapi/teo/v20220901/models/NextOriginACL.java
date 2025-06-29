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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NextOriginACL extends AbstractModel {

    /**
    * 版本号。
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 版本生效时间，时间是北京时间 UTC+8， 遵循 ISO 8601 标准的日期和时间格式。
    */
    @SerializedName("PlannedActiveTime")
    @Expose
    private String PlannedActiveTime;

    /**
    * 回源 IP 网段详情。
    */
    @SerializedName("EntireAddresses")
    @Expose
    private Addresses EntireAddresses;

    /**
    * 最新回源 IP 网段相较于 CurrentOrginACL 中回源 IP 网段新增的部分。
    */
    @SerializedName("AddedAddresses")
    @Expose
    private Addresses AddedAddresses;

    /**
    * 最新回源 IP 网段相较于 CurrentOrginACL 中回源 IP 网段删减的部分。
    */
    @SerializedName("RemovedAddresses")
    @Expose
    private Addresses RemovedAddresses;

    /**
    * 最新回源 IP 网段相较于 CurrentOrginACL 中回源 IP 网段无变化的部分。
    */
    @SerializedName("NoChangeAddresses")
    @Expose
    private Addresses NoChangeAddresses;

    /**
     * Get 版本号。 
     * @return Version 版本号。
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 版本号。
     * @param Version 版本号。
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 版本生效时间，时间是北京时间 UTC+8， 遵循 ISO 8601 标准的日期和时间格式。 
     * @return PlannedActiveTime 版本生效时间，时间是北京时间 UTC+8， 遵循 ISO 8601 标准的日期和时间格式。
     */
    public String getPlannedActiveTime() {
        return this.PlannedActiveTime;
    }

    /**
     * Set 版本生效时间，时间是北京时间 UTC+8， 遵循 ISO 8601 标准的日期和时间格式。
     * @param PlannedActiveTime 版本生效时间，时间是北京时间 UTC+8， 遵循 ISO 8601 标准的日期和时间格式。
     */
    public void setPlannedActiveTime(String PlannedActiveTime) {
        this.PlannedActiveTime = PlannedActiveTime;
    }

    /**
     * Get 回源 IP 网段详情。 
     * @return EntireAddresses 回源 IP 网段详情。
     */
    public Addresses getEntireAddresses() {
        return this.EntireAddresses;
    }

    /**
     * Set 回源 IP 网段详情。
     * @param EntireAddresses 回源 IP 网段详情。
     */
    public void setEntireAddresses(Addresses EntireAddresses) {
        this.EntireAddresses = EntireAddresses;
    }

    /**
     * Get 最新回源 IP 网段相较于 CurrentOrginACL 中回源 IP 网段新增的部分。 
     * @return AddedAddresses 最新回源 IP 网段相较于 CurrentOrginACL 中回源 IP 网段新增的部分。
     */
    public Addresses getAddedAddresses() {
        return this.AddedAddresses;
    }

    /**
     * Set 最新回源 IP 网段相较于 CurrentOrginACL 中回源 IP 网段新增的部分。
     * @param AddedAddresses 最新回源 IP 网段相较于 CurrentOrginACL 中回源 IP 网段新增的部分。
     */
    public void setAddedAddresses(Addresses AddedAddresses) {
        this.AddedAddresses = AddedAddresses;
    }

    /**
     * Get 最新回源 IP 网段相较于 CurrentOrginACL 中回源 IP 网段删减的部分。 
     * @return RemovedAddresses 最新回源 IP 网段相较于 CurrentOrginACL 中回源 IP 网段删减的部分。
     */
    public Addresses getRemovedAddresses() {
        return this.RemovedAddresses;
    }

    /**
     * Set 最新回源 IP 网段相较于 CurrentOrginACL 中回源 IP 网段删减的部分。
     * @param RemovedAddresses 最新回源 IP 网段相较于 CurrentOrginACL 中回源 IP 网段删减的部分。
     */
    public void setRemovedAddresses(Addresses RemovedAddresses) {
        this.RemovedAddresses = RemovedAddresses;
    }

    /**
     * Get 最新回源 IP 网段相较于 CurrentOrginACL 中回源 IP 网段无变化的部分。 
     * @return NoChangeAddresses 最新回源 IP 网段相较于 CurrentOrginACL 中回源 IP 网段无变化的部分。
     */
    public Addresses getNoChangeAddresses() {
        return this.NoChangeAddresses;
    }

    /**
     * Set 最新回源 IP 网段相较于 CurrentOrginACL 中回源 IP 网段无变化的部分。
     * @param NoChangeAddresses 最新回源 IP 网段相较于 CurrentOrginACL 中回源 IP 网段无变化的部分。
     */
    public void setNoChangeAddresses(Addresses NoChangeAddresses) {
        this.NoChangeAddresses = NoChangeAddresses;
    }

    public NextOriginACL() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NextOriginACL(NextOriginACL source) {
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.PlannedActiveTime != null) {
            this.PlannedActiveTime = new String(source.PlannedActiveTime);
        }
        if (source.EntireAddresses != null) {
            this.EntireAddresses = new Addresses(source.EntireAddresses);
        }
        if (source.AddedAddresses != null) {
            this.AddedAddresses = new Addresses(source.AddedAddresses);
        }
        if (source.RemovedAddresses != null) {
            this.RemovedAddresses = new Addresses(source.RemovedAddresses);
        }
        if (source.NoChangeAddresses != null) {
            this.NoChangeAddresses = new Addresses(source.NoChangeAddresses);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "PlannedActiveTime", this.PlannedActiveTime);
        this.setParamObj(map, prefix + "EntireAddresses.", this.EntireAddresses);
        this.setParamObj(map, prefix + "AddedAddresses.", this.AddedAddresses);
        this.setParamObj(map, prefix + "RemovedAddresses.", this.RemovedAddresses);
        this.setParamObj(map, prefix + "NoChangeAddresses.", this.NoChangeAddresses);

    }
}

