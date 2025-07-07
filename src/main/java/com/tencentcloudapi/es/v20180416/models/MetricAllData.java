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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MetricAllData extends AbstractModel {

    /**
    * 索引流量
    */
    @SerializedName("IndexTraffic")
    @Expose
    private Float IndexTraffic;

    /**
    * 存储大小
    */
    @SerializedName("Storage")
    @Expose
    private Float Storage;

    /**
    * 读请求次数
    */
    @SerializedName("ReadReqTimes")
    @Expose
    private Long ReadReqTimes;

    /**
    * 写请求次数
    */
    @SerializedName("WriteReqTimes")
    @Expose
    private Long WriteReqTimes;

    /**
    * 文档数量
    */
    @SerializedName("DocCount")
    @Expose
    private Long DocCount;

    /**
     * Get 索引流量 
     * @return IndexTraffic 索引流量
     */
    public Float getIndexTraffic() {
        return this.IndexTraffic;
    }

    /**
     * Set 索引流量
     * @param IndexTraffic 索引流量
     */
    public void setIndexTraffic(Float IndexTraffic) {
        this.IndexTraffic = IndexTraffic;
    }

    /**
     * Get 存储大小 
     * @return Storage 存储大小
     */
    public Float getStorage() {
        return this.Storage;
    }

    /**
     * Set 存储大小
     * @param Storage 存储大小
     */
    public void setStorage(Float Storage) {
        this.Storage = Storage;
    }

    /**
     * Get 读请求次数 
     * @return ReadReqTimes 读请求次数
     */
    public Long getReadReqTimes() {
        return this.ReadReqTimes;
    }

    /**
     * Set 读请求次数
     * @param ReadReqTimes 读请求次数
     */
    public void setReadReqTimes(Long ReadReqTimes) {
        this.ReadReqTimes = ReadReqTimes;
    }

    /**
     * Get 写请求次数 
     * @return WriteReqTimes 写请求次数
     */
    public Long getWriteReqTimes() {
        return this.WriteReqTimes;
    }

    /**
     * Set 写请求次数
     * @param WriteReqTimes 写请求次数
     */
    public void setWriteReqTimes(Long WriteReqTimes) {
        this.WriteReqTimes = WriteReqTimes;
    }

    /**
     * Get 文档数量 
     * @return DocCount 文档数量
     */
    public Long getDocCount() {
        return this.DocCount;
    }

    /**
     * Set 文档数量
     * @param DocCount 文档数量
     */
    public void setDocCount(Long DocCount) {
        this.DocCount = DocCount;
    }

    public MetricAllData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MetricAllData(MetricAllData source) {
        if (source.IndexTraffic != null) {
            this.IndexTraffic = new Float(source.IndexTraffic);
        }
        if (source.Storage != null) {
            this.Storage = new Float(source.Storage);
        }
        if (source.ReadReqTimes != null) {
            this.ReadReqTimes = new Long(source.ReadReqTimes);
        }
        if (source.WriteReqTimes != null) {
            this.WriteReqTimes = new Long(source.WriteReqTimes);
        }
        if (source.DocCount != null) {
            this.DocCount = new Long(source.DocCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IndexTraffic", this.IndexTraffic);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "ReadReqTimes", this.ReadReqTimes);
        this.setParamSimple(map, prefix + "WriteReqTimes", this.WriteReqTimes);
        this.setParamSimple(map, prefix + "DocCount", this.DocCount);

    }
}

