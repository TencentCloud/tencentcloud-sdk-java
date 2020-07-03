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

public class PullStreamConfig extends AbstractModel{

    /**
    * 拉流配置 ID。
    */
    @SerializedName("ConfigId")
    @Expose
    private String ConfigId;

    /**
    * 源 URL。
    */
    @SerializedName("FromUrl")
    @Expose
    private String FromUrl;

    /**
    * 目的 URL。
    */
    @SerializedName("ToUrl")
    @Expose
    private String ToUrl;

    /**
    * 区域名。
    */
    @SerializedName("AreaName")
    @Expose
    private String AreaName;

    /**
    * 运营商名。
    */
    @SerializedName("IspName")
    @Expose
    private String IspName;

    /**
    * 开始时间。
UTC格式时间，例如: 2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间。

UTC格式时间，例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 状态:
0: 无效。
1: 初始状态。
2: 正在运行。
3: 拉起失败。
4: 暂停。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 拉流配置 ID。 
     * @return ConfigId 拉流配置 ID。
     */
    public String getConfigId() {
        return this.ConfigId;
    }

    /**
     * Set 拉流配置 ID。
     * @param ConfigId 拉流配置 ID。
     */
    public void setConfigId(String ConfigId) {
        this.ConfigId = ConfigId;
    }

    /**
     * Get 源 URL。 
     * @return FromUrl 源 URL。
     */
    public String getFromUrl() {
        return this.FromUrl;
    }

    /**
     * Set 源 URL。
     * @param FromUrl 源 URL。
     */
    public void setFromUrl(String FromUrl) {
        this.FromUrl = FromUrl;
    }

    /**
     * Get 目的 URL。 
     * @return ToUrl 目的 URL。
     */
    public String getToUrl() {
        return this.ToUrl;
    }

    /**
     * Set 目的 URL。
     * @param ToUrl 目的 URL。
     */
    public void setToUrl(String ToUrl) {
        this.ToUrl = ToUrl;
    }

    /**
     * Get 区域名。 
     * @return AreaName 区域名。
     */
    public String getAreaName() {
        return this.AreaName;
    }

    /**
     * Set 区域名。
     * @param AreaName 区域名。
     */
    public void setAreaName(String AreaName) {
        this.AreaName = AreaName;
    }

    /**
     * Get 运营商名。 
     * @return IspName 运营商名。
     */
    public String getIspName() {
        return this.IspName;
    }

    /**
     * Set 运营商名。
     * @param IspName 运营商名。
     */
    public void setIspName(String IspName) {
        this.IspName = IspName;
    }

    /**
     * Get 开始时间。
UTC格式时间，例如: 2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。 
     * @return StartTime 开始时间。
UTC格式时间，例如: 2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间。
UTC格式时间，例如: 2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。
     * @param StartTime 开始时间。
UTC格式时间，例如: 2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间。

UTC格式时间，例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。 
     * @return EndTime 结束时间。

UTC格式时间，例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间。

UTC格式时间，例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。
     * @param EndTime 结束时间。

UTC格式时间，例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 状态:
0: 无效。
1: 初始状态。
2: 正在运行。
3: 拉起失败。
4: 暂停。 
     * @return Status 状态:
0: 无效。
1: 初始状态。
2: 正在运行。
3: 拉起失败。
4: 暂停。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态:
0: 无效。
1: 初始状态。
2: 正在运行。
3: 拉起失败。
4: 暂停。
     * @param Status 状态:
0: 无效。
1: 初始状态。
2: 正在运行。
3: 拉起失败。
4: 暂停。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfigId", this.ConfigId);
        this.setParamSimple(map, prefix + "FromUrl", this.FromUrl);
        this.setParamSimple(map, prefix + "ToUrl", this.ToUrl);
        this.setParamSimple(map, prefix + "AreaName", this.AreaName);
        this.setParamSimple(map, prefix + "IspName", this.IspName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

