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

public class FetchDatahubMessageByOffsetRequest extends AbstractModel {

    /**
    * 弹性topic名称，可通过DescribeDatahubTopics接口获取。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 分区id
    */
    @SerializedName("Partition")
    @Expose
    private Long Partition;

    /**
    * 位点信息
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 弹性topic名称，可通过DescribeDatahubTopics接口获取。 
     * @return Name 弹性topic名称，可通过DescribeDatahubTopics接口获取。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 弹性topic名称，可通过DescribeDatahubTopics接口获取。
     * @param Name 弹性topic名称，可通过DescribeDatahubTopics接口获取。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 分区id 
     * @return Partition 分区id
     */
    public Long getPartition() {
        return this.Partition;
    }

    /**
     * Set 分区id
     * @param Partition 分区id
     */
    public void setPartition(Long Partition) {
        this.Partition = Partition;
    }

    /**
     * Get 位点信息 
     * @return Offset 位点信息
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 位点信息
     * @param Offset 位点信息
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public FetchDatahubMessageByOffsetRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FetchDatahubMessageByOffsetRequest(FetchDatahubMessageByOffsetRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Partition != null) {
            this.Partition = new Long(source.Partition);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Partition", this.Partition);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

