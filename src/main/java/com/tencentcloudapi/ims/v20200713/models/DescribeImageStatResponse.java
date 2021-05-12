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
package com.tencentcloudapi.ims.v20200713.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeImageStatResponse extends AbstractModel{

    /**
    * 识别结果统计
    */
    @SerializedName("Overview")
    @Expose
    private Overview Overview;

    /**
    * 识别量统计
    */
    @SerializedName("TrendCount")
    @Expose
    private TrendCount [] TrendCount;

    /**
    * 违规数据分布
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EvilCount")
    @Expose
    private EvilCount [] EvilCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 识别结果统计 
     * @return Overview 识别结果统计
     */
    public Overview getOverview() {
        return this.Overview;
    }

    /**
     * Set 识别结果统计
     * @param Overview 识别结果统计
     */
    public void setOverview(Overview Overview) {
        this.Overview = Overview;
    }

    /**
     * Get 识别量统计 
     * @return TrendCount 识别量统计
     */
    public TrendCount [] getTrendCount() {
        return this.TrendCount;
    }

    /**
     * Set 识别量统计
     * @param TrendCount 识别量统计
     */
    public void setTrendCount(TrendCount [] TrendCount) {
        this.TrendCount = TrendCount;
    }

    /**
     * Get 违规数据分布
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EvilCount 违规数据分布
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EvilCount [] getEvilCount() {
        return this.EvilCount;
    }

    /**
     * Set 违规数据分布
注意：此字段可能返回 null，表示取不到有效值。
     * @param EvilCount 违规数据分布
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEvilCount(EvilCount [] EvilCount) {
        this.EvilCount = EvilCount;
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

    public DescribeImageStatResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeImageStatResponse(DescribeImageStatResponse source) {
        if (source.Overview != null) {
            this.Overview = new Overview(source.Overview);
        }
        if (source.TrendCount != null) {
            this.TrendCount = new TrendCount[source.TrendCount.length];
            for (int i = 0; i < source.TrendCount.length; i++) {
                this.TrendCount[i] = new TrendCount(source.TrendCount[i]);
            }
        }
        if (source.EvilCount != null) {
            this.EvilCount = new EvilCount[source.EvilCount.length];
            for (int i = 0; i < source.EvilCount.length; i++) {
                this.EvilCount[i] = new EvilCount(source.EvilCount[i]);
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
        this.setParamObj(map, prefix + "Overview.", this.Overview);
        this.setParamArrayObj(map, prefix + "TrendCount.", this.TrendCount);
        this.setParamArrayObj(map, prefix + "EvilCount.", this.EvilCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

