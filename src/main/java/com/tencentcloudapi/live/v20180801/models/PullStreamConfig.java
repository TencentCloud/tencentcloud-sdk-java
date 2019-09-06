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

public class PullStreamConfig  extends AbstractModel{

    /**
    * 拉流配置Id。
    */
    @SerializedName("ConfigId")
    @Expose
    private String ConfigId;

    /**
    * 源Url。
    */
    @SerializedName("FromUrl")
    @Expose
    private String FromUrl;

    /**
    * 目的Url。
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
UTC格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间。

UTC格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 0无效，1初始状态，2正在运行，3拉起失败，4暂停。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * 获取拉流配置Id。
     * @return ConfigId 拉流配置Id。
     */
    public String getConfigId() {
        return this.ConfigId;
    }

    /**
     * 设置拉流配置Id。
     * @param ConfigId 拉流配置Id。
     */
    public void setConfigId(String ConfigId) {
        this.ConfigId = ConfigId;
    }

    /**
     * 获取源Url。
     * @return FromUrl 源Url。
     */
    public String getFromUrl() {
        return this.FromUrl;
    }

    /**
     * 设置源Url。
     * @param FromUrl 源Url。
     */
    public void setFromUrl(String FromUrl) {
        this.FromUrl = FromUrl;
    }

    /**
     * 获取目的Url。
     * @return ToUrl 目的Url。
     */
    public String getToUrl() {
        return this.ToUrl;
    }

    /**
     * 设置目的Url。
     * @param ToUrl 目的Url。
     */
    public void setToUrl(String ToUrl) {
        this.ToUrl = ToUrl;
    }

    /**
     * 获取区域名。
     * @return AreaName 区域名。
     */
    public String getAreaName() {
        return this.AreaName;
    }

    /**
     * 设置区域名。
     * @param AreaName 区域名。
     */
    public void setAreaName(String AreaName) {
        this.AreaName = AreaName;
    }

    /**
     * 获取运营商名。
     * @return IspName 运营商名。
     */
    public String getIspName() {
        return this.IspName;
    }

    /**
     * 设置运营商名。
     * @param IspName 运营商名。
     */
    public void setIspName(String IspName) {
        this.IspName = IspName;
    }

    /**
     * 获取开始时间。
UTC格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     * @return StartTime 开始时间。
UTC格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * 设置开始时间。
UTC格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     * @param StartTime 开始时间。
UTC格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * 获取结束时间。

UTC格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     * @return EndTime 结束时间。

UTC格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * 设置结束时间。

UTC格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     * @param EndTime 结束时间。

UTC格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * 获取0无效，1初始状态，2正在运行，3拉起失败，4暂停。
     * @return Status 0无效，1初始状态，2正在运行，3拉起失败，4暂停。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * 设置0无效，1初始状态，2正在运行，3拉起失败，4暂停。
     * @param Status 0无效，1初始状态，2正在运行，3拉起失败，4暂停。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * 内部实现，用户禁止调用
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

