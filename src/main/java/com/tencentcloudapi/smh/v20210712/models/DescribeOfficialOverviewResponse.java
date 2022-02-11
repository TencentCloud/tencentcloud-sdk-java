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
package com.tencentcloudapi.smh.v20210712.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOfficialOverviewResponse extends AbstractModel{

    /**
    * 云盘实例数量
    */
    @SerializedName("Quantity")
    @Expose
    private Long Quantity;

    /**
    * 已经使用的总存储量，单位为 Bytes，由于数字类型精度限制，该字段为 String 类型。
    */
    @SerializedName("Storage")
    @Expose
    private String Storage;

    /**
    * 已经分配和使用的总用户数
    */
    @SerializedName("UserCount")
    @Expose
    private Long UserCount;

    /**
    * 本月外网下行流量，单位为 Bytes，由于数字类型精度限制，该字段为 String 类型。
    */
    @SerializedName("InternetTraffic")
    @Expose
    private String InternetTraffic;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 云盘实例数量 
     * @return Quantity 云盘实例数量
     */
    public Long getQuantity() {
        return this.Quantity;
    }

    /**
     * Set 云盘实例数量
     * @param Quantity 云盘实例数量
     */
    public void setQuantity(Long Quantity) {
        this.Quantity = Quantity;
    }

    /**
     * Get 已经使用的总存储量，单位为 Bytes，由于数字类型精度限制，该字段为 String 类型。 
     * @return Storage 已经使用的总存储量，单位为 Bytes，由于数字类型精度限制，该字段为 String 类型。
     */
    public String getStorage() {
        return this.Storage;
    }

    /**
     * Set 已经使用的总存储量，单位为 Bytes，由于数字类型精度限制，该字段为 String 类型。
     * @param Storage 已经使用的总存储量，单位为 Bytes，由于数字类型精度限制，该字段为 String 类型。
     */
    public void setStorage(String Storage) {
        this.Storage = Storage;
    }

    /**
     * Get 已经分配和使用的总用户数 
     * @return UserCount 已经分配和使用的总用户数
     */
    public Long getUserCount() {
        return this.UserCount;
    }

    /**
     * Set 已经分配和使用的总用户数
     * @param UserCount 已经分配和使用的总用户数
     */
    public void setUserCount(Long UserCount) {
        this.UserCount = UserCount;
    }

    /**
     * Get 本月外网下行流量，单位为 Bytes，由于数字类型精度限制，该字段为 String 类型。 
     * @return InternetTraffic 本月外网下行流量，单位为 Bytes，由于数字类型精度限制，该字段为 String 类型。
     */
    public String getInternetTraffic() {
        return this.InternetTraffic;
    }

    /**
     * Set 本月外网下行流量，单位为 Bytes，由于数字类型精度限制，该字段为 String 类型。
     * @param InternetTraffic 本月外网下行流量，单位为 Bytes，由于数字类型精度限制，该字段为 String 类型。
     */
    public void setInternetTraffic(String InternetTraffic) {
        this.InternetTraffic = InternetTraffic;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeOfficialOverviewResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOfficialOverviewResponse(DescribeOfficialOverviewResponse source) {
        if (source.Quantity != null) {
            this.Quantity = new Long(source.Quantity);
        }
        if (source.Storage != null) {
            this.Storage = new String(source.Storage);
        }
        if (source.UserCount != null) {
            this.UserCount = new Long(source.UserCount);
        }
        if (source.InternetTraffic != null) {
            this.InternetTraffic = new String(source.InternetTraffic);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Quantity", this.Quantity);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "UserCount", this.UserCount);
        this.setParamSimple(map, prefix + "InternetTraffic", this.InternetTraffic);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

