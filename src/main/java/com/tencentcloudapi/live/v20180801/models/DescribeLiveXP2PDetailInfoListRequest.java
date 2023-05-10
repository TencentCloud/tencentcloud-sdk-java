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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLiveXP2PDetailInfoListRequest extends AbstractModel{

    /**
    * utc分钟粒度查询时间，查询某一分钟的用量数据，格式为：yyyy-mm-ddTHH:MM:00Z，参考https://cloud.tencent.com/document/product/266/11732#I，
例如：北京时间2019-01-08 10:00:00，对应utc时间为：2019-01-08T10:00:00+08:00。

支持最近六个月的查询。
    */
    @SerializedName("QueryTime")
    @Expose
    private String QueryTime;

    /**
    * 类型数组，分直播live和点播vod，不传默认查全部。
    */
    @SerializedName("Type")
    @Expose
    private String [] Type;

    /**
    * 查询流数组，不传默认查所有流。
    */
    @SerializedName("StreamNames")
    @Expose
    private String [] StreamNames;

    /**
    * 查询维度，不传该参数则默认查询流维度的数据，传递该参数则只查对应维度的数据，和返回值的字段相关，目前支持AppId维度查询。
    */
    @SerializedName("Dimension")
    @Expose
    private String [] Dimension;

    /**
     * Get utc分钟粒度查询时间，查询某一分钟的用量数据，格式为：yyyy-mm-ddTHH:MM:00Z，参考https://cloud.tencent.com/document/product/266/11732#I，
例如：北京时间2019-01-08 10:00:00，对应utc时间为：2019-01-08T10:00:00+08:00。

支持最近六个月的查询。 
     * @return QueryTime utc分钟粒度查询时间，查询某一分钟的用量数据，格式为：yyyy-mm-ddTHH:MM:00Z，参考https://cloud.tencent.com/document/product/266/11732#I，
例如：北京时间2019-01-08 10:00:00，对应utc时间为：2019-01-08T10:00:00+08:00。

支持最近六个月的查询。
     */
    public String getQueryTime() {
        return this.QueryTime;
    }

    /**
     * Set utc分钟粒度查询时间，查询某一分钟的用量数据，格式为：yyyy-mm-ddTHH:MM:00Z，参考https://cloud.tencent.com/document/product/266/11732#I，
例如：北京时间2019-01-08 10:00:00，对应utc时间为：2019-01-08T10:00:00+08:00。

支持最近六个月的查询。
     * @param QueryTime utc分钟粒度查询时间，查询某一分钟的用量数据，格式为：yyyy-mm-ddTHH:MM:00Z，参考https://cloud.tencent.com/document/product/266/11732#I，
例如：北京时间2019-01-08 10:00:00，对应utc时间为：2019-01-08T10:00:00+08:00。

支持最近六个月的查询。
     */
    public void setQueryTime(String QueryTime) {
        this.QueryTime = QueryTime;
    }

    /**
     * Get 类型数组，分直播live和点播vod，不传默认查全部。 
     * @return Type 类型数组，分直播live和点播vod，不传默认查全部。
     */
    public String [] getType() {
        return this.Type;
    }

    /**
     * Set 类型数组，分直播live和点播vod，不传默认查全部。
     * @param Type 类型数组，分直播live和点播vod，不传默认查全部。
     */
    public void setType(String [] Type) {
        this.Type = Type;
    }

    /**
     * Get 查询流数组，不传默认查所有流。 
     * @return StreamNames 查询流数组，不传默认查所有流。
     */
    public String [] getStreamNames() {
        return this.StreamNames;
    }

    /**
     * Set 查询流数组，不传默认查所有流。
     * @param StreamNames 查询流数组，不传默认查所有流。
     */
    public void setStreamNames(String [] StreamNames) {
        this.StreamNames = StreamNames;
    }

    /**
     * Get 查询维度，不传该参数则默认查询流维度的数据，传递该参数则只查对应维度的数据，和返回值的字段相关，目前支持AppId维度查询。 
     * @return Dimension 查询维度，不传该参数则默认查询流维度的数据，传递该参数则只查对应维度的数据，和返回值的字段相关，目前支持AppId维度查询。
     */
    public String [] getDimension() {
        return this.Dimension;
    }

    /**
     * Set 查询维度，不传该参数则默认查询流维度的数据，传递该参数则只查对应维度的数据，和返回值的字段相关，目前支持AppId维度查询。
     * @param Dimension 查询维度，不传该参数则默认查询流维度的数据，传递该参数则只查对应维度的数据，和返回值的字段相关，目前支持AppId维度查询。
     */
    public void setDimension(String [] Dimension) {
        this.Dimension = Dimension;
    }

    public DescribeLiveXP2PDetailInfoListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLiveXP2PDetailInfoListRequest(DescribeLiveXP2PDetailInfoListRequest source) {
        if (source.QueryTime != null) {
            this.QueryTime = new String(source.QueryTime);
        }
        if (source.Type != null) {
            this.Type = new String[source.Type.length];
            for (int i = 0; i < source.Type.length; i++) {
                this.Type[i] = new String(source.Type[i]);
            }
        }
        if (source.StreamNames != null) {
            this.StreamNames = new String[source.StreamNames.length];
            for (int i = 0; i < source.StreamNames.length; i++) {
                this.StreamNames[i] = new String(source.StreamNames[i]);
            }
        }
        if (source.Dimension != null) {
            this.Dimension = new String[source.Dimension.length];
            for (int i = 0; i < source.Dimension.length; i++) {
                this.Dimension[i] = new String(source.Dimension[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QueryTime", this.QueryTime);
        this.setParamArraySimple(map, prefix + "Type.", this.Type);
        this.setParamArraySimple(map, prefix + "StreamNames.", this.StreamNames);
        this.setParamArraySimple(map, prefix + "Dimension.", this.Dimension);

    }
}

