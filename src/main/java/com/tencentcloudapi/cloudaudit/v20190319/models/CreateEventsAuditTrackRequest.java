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
package com.tencentcloudapi.cloudaudit.v20190319.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateEventsAuditTrackRequest extends AbstractModel {

    /**
    * <p>跟踪集名称，仅支持大小写字母、数字、-以及_的组合，3-48个字符</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>跟踪集状态（未开启：0；开启：1）</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>数据投递存储（目前支持 cos、cls、ckafka）</p>
    */
    @SerializedName("Storage")
    @Expose
    private Storage Storage;

    /**
    * <p>数据过滤条件</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter Filters;

    /**
    * <p>是否开启将集团成员操作日志投递到集团管理账号或者可信服务管理账号(0：未开启，1：开启，只能集团管理账号或者可信服务管理账号开启此项功能)</p>
    */
    @SerializedName("TrackForAllMembers")
    @Expose
    private Long TrackForAllMembers;

    /**
     * Get <p>跟踪集名称，仅支持大小写字母、数字、-以及_的组合，3-48个字符</p> 
     * @return Name <p>跟踪集名称，仅支持大小写字母、数字、-以及_的组合，3-48个字符</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>跟踪集名称，仅支持大小写字母、数字、-以及_的组合，3-48个字符</p>
     * @param Name <p>跟踪集名称，仅支持大小写字母、数字、-以及_的组合，3-48个字符</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>跟踪集状态（未开启：0；开启：1）</p> 
     * @return Status <p>跟踪集状态（未开启：0；开启：1）</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>跟踪集状态（未开启：0；开启：1）</p>
     * @param Status <p>跟踪集状态（未开启：0；开启：1）</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>数据投递存储（目前支持 cos、cls、ckafka）</p> 
     * @return Storage <p>数据投递存储（目前支持 cos、cls、ckafka）</p>
     */
    public Storage getStorage() {
        return this.Storage;
    }

    /**
     * Set <p>数据投递存储（目前支持 cos、cls、ckafka）</p>
     * @param Storage <p>数据投递存储（目前支持 cos、cls、ckafka）</p>
     */
    public void setStorage(Storage Storage) {
        this.Storage = Storage;
    }

    /**
     * Get <p>数据过滤条件</p> 
     * @return Filters <p>数据过滤条件</p>
     */
    public Filter getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>数据过滤条件</p>
     * @param Filters <p>数据过滤条件</p>
     */
    public void setFilters(Filter Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>是否开启将集团成员操作日志投递到集团管理账号或者可信服务管理账号(0：未开启，1：开启，只能集团管理账号或者可信服务管理账号开启此项功能)</p> 
     * @return TrackForAllMembers <p>是否开启将集团成员操作日志投递到集团管理账号或者可信服务管理账号(0：未开启，1：开启，只能集团管理账号或者可信服务管理账号开启此项功能)</p>
     */
    public Long getTrackForAllMembers() {
        return this.TrackForAllMembers;
    }

    /**
     * Set <p>是否开启将集团成员操作日志投递到集团管理账号或者可信服务管理账号(0：未开启，1：开启，只能集团管理账号或者可信服务管理账号开启此项功能)</p>
     * @param TrackForAllMembers <p>是否开启将集团成员操作日志投递到集团管理账号或者可信服务管理账号(0：未开启，1：开启，只能集团管理账号或者可信服务管理账号开启此项功能)</p>
     */
    public void setTrackForAllMembers(Long TrackForAllMembers) {
        this.TrackForAllMembers = TrackForAllMembers;
    }

    public CreateEventsAuditTrackRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateEventsAuditTrackRequest(CreateEventsAuditTrackRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Storage != null) {
            this.Storage = new Storage(source.Storage);
        }
        if (source.Filters != null) {
            this.Filters = new Filter(source.Filters);
        }
        if (source.TrackForAllMembers != null) {
            this.TrackForAllMembers = new Long(source.TrackForAllMembers);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "Storage.", this.Storage);
        this.setParamObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "TrackForAllMembers", this.TrackForAllMembers);

    }
}

