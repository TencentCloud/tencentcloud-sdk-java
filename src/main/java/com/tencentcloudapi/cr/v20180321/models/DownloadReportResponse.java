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
package com.tencentcloudapi.cr.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DownloadReportResponse extends AbstractModel{

    /**
    * 到期/逾期提醒日报下载地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DailyReportUrl")
    @Expose
    private String DailyReportUrl;

    /**
    * 到期/逾期提醒结果下载地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResultReportUrl")
    @Expose
    private String ResultReportUrl;

    /**
    * 到期/逾期提醒明细下载地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DetailReportUrl")
    @Expose
    private String DetailReportUrl;

    /**
    * 回访日报下载地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CallbackDailyReportUrl")
    @Expose
    private String CallbackDailyReportUrl;

    /**
    * 回访结果下载地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CallbackResultReportUrl")
    @Expose
    private String CallbackResultReportUrl;

    /**
    * 回访明细下载地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CallbackDetailReportUrl")
    @Expose
    private String CallbackDetailReportUrl;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 到期/逾期提醒日报下载地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DailyReportUrl 到期/逾期提醒日报下载地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDailyReportUrl() {
        return this.DailyReportUrl;
    }

    /**
     * Set 到期/逾期提醒日报下载地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param DailyReportUrl 到期/逾期提醒日报下载地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDailyReportUrl(String DailyReportUrl) {
        this.DailyReportUrl = DailyReportUrl;
    }

    /**
     * Get 到期/逾期提醒结果下载地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResultReportUrl 到期/逾期提醒结果下载地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResultReportUrl() {
        return this.ResultReportUrl;
    }

    /**
     * Set 到期/逾期提醒结果下载地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResultReportUrl 到期/逾期提醒结果下载地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResultReportUrl(String ResultReportUrl) {
        this.ResultReportUrl = ResultReportUrl;
    }

    /**
     * Get 到期/逾期提醒明细下载地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DetailReportUrl 到期/逾期提醒明细下载地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDetailReportUrl() {
        return this.DetailReportUrl;
    }

    /**
     * Set 到期/逾期提醒明细下载地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param DetailReportUrl 到期/逾期提醒明细下载地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDetailReportUrl(String DetailReportUrl) {
        this.DetailReportUrl = DetailReportUrl;
    }

    /**
     * Get 回访日报下载地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CallbackDailyReportUrl 回访日报下载地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCallbackDailyReportUrl() {
        return this.CallbackDailyReportUrl;
    }

    /**
     * Set 回访日报下载地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param CallbackDailyReportUrl 回访日报下载地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCallbackDailyReportUrl(String CallbackDailyReportUrl) {
        this.CallbackDailyReportUrl = CallbackDailyReportUrl;
    }

    /**
     * Get 回访结果下载地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CallbackResultReportUrl 回访结果下载地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCallbackResultReportUrl() {
        return this.CallbackResultReportUrl;
    }

    /**
     * Set 回访结果下载地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param CallbackResultReportUrl 回访结果下载地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCallbackResultReportUrl(String CallbackResultReportUrl) {
        this.CallbackResultReportUrl = CallbackResultReportUrl;
    }

    /**
     * Get 回访明细下载地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CallbackDetailReportUrl 回访明细下载地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCallbackDetailReportUrl() {
        return this.CallbackDetailReportUrl;
    }

    /**
     * Set 回访明细下载地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param CallbackDetailReportUrl 回访明细下载地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCallbackDetailReportUrl(String CallbackDetailReportUrl) {
        this.CallbackDetailReportUrl = CallbackDetailReportUrl;
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
        this.setParamSimple(map, prefix + "DailyReportUrl", this.DailyReportUrl);
        this.setParamSimple(map, prefix + "ResultReportUrl", this.ResultReportUrl);
        this.setParamSimple(map, prefix + "DetailReportUrl", this.DetailReportUrl);
        this.setParamSimple(map, prefix + "CallbackDailyReportUrl", this.CallbackDailyReportUrl);
        this.setParamSimple(map, prefix + "CallbackResultReportUrl", this.CallbackResultReportUrl);
        this.setParamSimple(map, prefix + "CallbackDetailReportUrl", this.CallbackDetailReportUrl);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

