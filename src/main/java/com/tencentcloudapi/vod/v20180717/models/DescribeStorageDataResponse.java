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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeStorageDataResponse extends AbstractModel{

    /**
    * 当前媒体总量。
    */
    @SerializedName("MediaCount")
    @Expose
    private Long MediaCount;

    /**
    * 当前总存储量，单位是字节。
    */
    @SerializedName("TotalStorage")
    @Expose
    private Long TotalStorage;

    /**
    * 当前低频存储量，单位是字节。
    */
    @SerializedName("InfrequentStorage")
    @Expose
    private Long InfrequentStorage;

    /**
    * 当前标准存储量，单位是字节。
    */
    @SerializedName("StandardStorage")
    @Expose
    private Long StandardStorage;

    /**
    * 各计费区域的存储用量。
    */
    @SerializedName("StorageStat")
    @Expose
    private StorageStatData [] StorageStat;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 当前媒体总量。 
     * @return MediaCount 当前媒体总量。
     */
    public Long getMediaCount() {
        return this.MediaCount;
    }

    /**
     * Set 当前媒体总量。
     * @param MediaCount 当前媒体总量。
     */
    public void setMediaCount(Long MediaCount) {
        this.MediaCount = MediaCount;
    }

    /**
     * Get 当前总存储量，单位是字节。 
     * @return TotalStorage 当前总存储量，单位是字节。
     */
    public Long getTotalStorage() {
        return this.TotalStorage;
    }

    /**
     * Set 当前总存储量，单位是字节。
     * @param TotalStorage 当前总存储量，单位是字节。
     */
    public void setTotalStorage(Long TotalStorage) {
        this.TotalStorage = TotalStorage;
    }

    /**
     * Get 当前低频存储量，单位是字节。 
     * @return InfrequentStorage 当前低频存储量，单位是字节。
     */
    public Long getInfrequentStorage() {
        return this.InfrequentStorage;
    }

    /**
     * Set 当前低频存储量，单位是字节。
     * @param InfrequentStorage 当前低频存储量，单位是字节。
     */
    public void setInfrequentStorage(Long InfrequentStorage) {
        this.InfrequentStorage = InfrequentStorage;
    }

    /**
     * Get 当前标准存储量，单位是字节。 
     * @return StandardStorage 当前标准存储量，单位是字节。
     */
    public Long getStandardStorage() {
        return this.StandardStorage;
    }

    /**
     * Set 当前标准存储量，单位是字节。
     * @param StandardStorage 当前标准存储量，单位是字节。
     */
    public void setStandardStorage(Long StandardStorage) {
        this.StandardStorage = StandardStorage;
    }

    /**
     * Get 各计费区域的存储用量。 
     * @return StorageStat 各计费区域的存储用量。
     */
    public StorageStatData [] getStorageStat() {
        return this.StorageStat;
    }

    /**
     * Set 各计费区域的存储用量。
     * @param StorageStat 各计费区域的存储用量。
     */
    public void setStorageStat(StorageStatData [] StorageStat) {
        this.StorageStat = StorageStat;
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

    public DescribeStorageDataResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStorageDataResponse(DescribeStorageDataResponse source) {
        if (source.MediaCount != null) {
            this.MediaCount = new Long(source.MediaCount);
        }
        if (source.TotalStorage != null) {
            this.TotalStorage = new Long(source.TotalStorage);
        }
        if (source.InfrequentStorage != null) {
            this.InfrequentStorage = new Long(source.InfrequentStorage);
        }
        if (source.StandardStorage != null) {
            this.StandardStorage = new Long(source.StandardStorage);
        }
        if (source.StorageStat != null) {
            this.StorageStat = new StorageStatData[source.StorageStat.length];
            for (int i = 0; i < source.StorageStat.length; i++) {
                this.StorageStat[i] = new StorageStatData(source.StorageStat[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MediaCount", this.MediaCount);
        this.setParamSimple(map, prefix + "TotalStorage", this.TotalStorage);
        this.setParamSimple(map, prefix + "InfrequentStorage", this.InfrequentStorage);
        this.setParamSimple(map, prefix + "StandardStorage", this.StandardStorage);
        this.setParamArrayObj(map, prefix + "StorageStat.", this.StorageStat);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

