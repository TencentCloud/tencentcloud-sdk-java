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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MediaCount", this.MediaCount);
        this.setParamSimple(map, prefix + "TotalStorage", this.TotalStorage);
        this.setParamSimple(map, prefix + "InfrequentStorage", this.InfrequentStorage);
        this.setParamSimple(map, prefix + "StandardStorage", this.StandardStorage);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

