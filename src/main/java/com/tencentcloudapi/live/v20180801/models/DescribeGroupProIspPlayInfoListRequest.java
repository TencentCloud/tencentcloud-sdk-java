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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGroupProIspPlayInfoListRequest extends AbstractModel {

    /**
    * 起始时间点，
使用UTC格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/267/38543#:~:text=I-,ISO,-%E6%97%A5%E6%9C%9F%E6%A0%BC%E5%BC%8F)。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间点，
使用UTC格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/267/38543#:~:text=I-,ISO,-%E6%97%A5%E6%9C%9F%E6%A0%BC%E5%BC%8F)。
时间跨度在（0,3小时]，支持最近1个月数据查询。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 播放域名，默认为不填，表示求总体数据。
    */
    @SerializedName("PlayDomains")
    @Expose
    private String [] PlayDomains;

    /**
    * 省份列表，默认不填，则返回各省份的数据。
    */
    @SerializedName("ProvinceNames")
    @Expose
    private String [] ProvinceNames;

    /**
    * 运营商列表，默认不填，则返回整个运营商的数据。
    */
    @SerializedName("IspNames")
    @Expose
    private String [] IspNames;

    /**
    * 国内还是国外，如果为空，查询所有地区数据；如果为“Mainland”，查询国内数据；如果为“Oversea”，则查询国外数据。
    */
    @SerializedName("MainlandOrOversea")
    @Expose
    private String MainlandOrOversea;

    /**
     * Get 起始时间点，
使用UTC格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/267/38543#:~:text=I-,ISO,-%E6%97%A5%E6%9C%9F%E6%A0%BC%E5%BC%8F)。 
     * @return StartTime 起始时间点，
使用UTC格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/267/38543#:~:text=I-,ISO,-%E6%97%A5%E6%9C%9F%E6%A0%BC%E5%BC%8F)。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 起始时间点，
使用UTC格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/267/38543#:~:text=I-,ISO,-%E6%97%A5%E6%9C%9F%E6%A0%BC%E5%BC%8F)。
     * @param StartTime 起始时间点，
使用UTC格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/267/38543#:~:text=I-,ISO,-%E6%97%A5%E6%9C%9F%E6%A0%BC%E5%BC%8F)。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间点，
使用UTC格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/267/38543#:~:text=I-,ISO,-%E6%97%A5%E6%9C%9F%E6%A0%BC%E5%BC%8F)。
时间跨度在（0,3小时]，支持最近1个月数据查询。 
     * @return EndTime 结束时间点，
使用UTC格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/267/38543#:~:text=I-,ISO,-%E6%97%A5%E6%9C%9F%E6%A0%BC%E5%BC%8F)。
时间跨度在（0,3小时]，支持最近1个月数据查询。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间点，
使用UTC格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/267/38543#:~:text=I-,ISO,-%E6%97%A5%E6%9C%9F%E6%A0%BC%E5%BC%8F)。
时间跨度在（0,3小时]，支持最近1个月数据查询。
     * @param EndTime 结束时间点，
使用UTC格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/267/38543#:~:text=I-,ISO,-%E6%97%A5%E6%9C%9F%E6%A0%BC%E5%BC%8F)。
时间跨度在（0,3小时]，支持最近1个月数据查询。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 播放域名，默认为不填，表示求总体数据。 
     * @return PlayDomains 播放域名，默认为不填，表示求总体数据。
     */
    public String [] getPlayDomains() {
        return this.PlayDomains;
    }

    /**
     * Set 播放域名，默认为不填，表示求总体数据。
     * @param PlayDomains 播放域名，默认为不填，表示求总体数据。
     */
    public void setPlayDomains(String [] PlayDomains) {
        this.PlayDomains = PlayDomains;
    }

    /**
     * Get 省份列表，默认不填，则返回各省份的数据。 
     * @return ProvinceNames 省份列表，默认不填，则返回各省份的数据。
     */
    public String [] getProvinceNames() {
        return this.ProvinceNames;
    }

    /**
     * Set 省份列表，默认不填，则返回各省份的数据。
     * @param ProvinceNames 省份列表，默认不填，则返回各省份的数据。
     */
    public void setProvinceNames(String [] ProvinceNames) {
        this.ProvinceNames = ProvinceNames;
    }

    /**
     * Get 运营商列表，默认不填，则返回整个运营商的数据。 
     * @return IspNames 运营商列表，默认不填，则返回整个运营商的数据。
     */
    public String [] getIspNames() {
        return this.IspNames;
    }

    /**
     * Set 运营商列表，默认不填，则返回整个运营商的数据。
     * @param IspNames 运营商列表，默认不填，则返回整个运营商的数据。
     */
    public void setIspNames(String [] IspNames) {
        this.IspNames = IspNames;
    }

    /**
     * Get 国内还是国外，如果为空，查询所有地区数据；如果为“Mainland”，查询国内数据；如果为“Oversea”，则查询国外数据。 
     * @return MainlandOrOversea 国内还是国外，如果为空，查询所有地区数据；如果为“Mainland”，查询国内数据；如果为“Oversea”，则查询国外数据。
     */
    public String getMainlandOrOversea() {
        return this.MainlandOrOversea;
    }

    /**
     * Set 国内还是国外，如果为空，查询所有地区数据；如果为“Mainland”，查询国内数据；如果为“Oversea”，则查询国外数据。
     * @param MainlandOrOversea 国内还是国外，如果为空，查询所有地区数据；如果为“Mainland”，查询国内数据；如果为“Oversea”，则查询国外数据。
     */
    public void setMainlandOrOversea(String MainlandOrOversea) {
        this.MainlandOrOversea = MainlandOrOversea;
    }

    public DescribeGroupProIspPlayInfoListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGroupProIspPlayInfoListRequest(DescribeGroupProIspPlayInfoListRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.PlayDomains != null) {
            this.PlayDomains = new String[source.PlayDomains.length];
            for (int i = 0; i < source.PlayDomains.length; i++) {
                this.PlayDomains[i] = new String(source.PlayDomains[i]);
            }
        }
        if (source.ProvinceNames != null) {
            this.ProvinceNames = new String[source.ProvinceNames.length];
            for (int i = 0; i < source.ProvinceNames.length; i++) {
                this.ProvinceNames[i] = new String(source.ProvinceNames[i]);
            }
        }
        if (source.IspNames != null) {
            this.IspNames = new String[source.IspNames.length];
            for (int i = 0; i < source.IspNames.length; i++) {
                this.IspNames[i] = new String(source.IspNames[i]);
            }
        }
        if (source.MainlandOrOversea != null) {
            this.MainlandOrOversea = new String(source.MainlandOrOversea);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "PlayDomains.", this.PlayDomains);
        this.setParamArraySimple(map, prefix + "ProvinceNames.", this.ProvinceNames);
        this.setParamArraySimple(map, prefix + "IspNames.", this.IspNames);
        this.setParamSimple(map, prefix + "MainlandOrOversea", this.MainlandOrOversea);

    }
}

