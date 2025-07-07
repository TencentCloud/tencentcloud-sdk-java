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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReportMsgRes extends AbstractModel {

    /**
    * 上报消息对应下标的16位标识Id, 即第几个消息

    */
    @SerializedName("ReportId")
    @Expose
    private String ReportId;

    /**
    * 上报消息结果，1表示成功推送，0表示推送失败

    */
    @SerializedName("ReportStatus")
    @Expose
    private Long ReportStatus;

    /**
     * Get 上报消息对应下标的16位标识Id, 即第几个消息
 
     * @return ReportId 上报消息对应下标的16位标识Id, 即第几个消息

     */
    public String getReportId() {
        return this.ReportId;
    }

    /**
     * Set 上报消息对应下标的16位标识Id, 即第几个消息

     * @param ReportId 上报消息对应下标的16位标识Id, 即第几个消息

     */
    public void setReportId(String ReportId) {
        this.ReportId = ReportId;
    }

    /**
     * Get 上报消息结果，1表示成功推送，0表示推送失败
 
     * @return ReportStatus 上报消息结果，1表示成功推送，0表示推送失败

     */
    public Long getReportStatus() {
        return this.ReportStatus;
    }

    /**
     * Set 上报消息结果，1表示成功推送，0表示推送失败

     * @param ReportStatus 上报消息结果，1表示成功推送，0表示推送失败

     */
    public void setReportStatus(Long ReportStatus) {
        this.ReportStatus = ReportStatus;
    }

    public ReportMsgRes() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReportMsgRes(ReportMsgRes source) {
        if (source.ReportId != null) {
            this.ReportId = new String(source.ReportId);
        }
        if (source.ReportStatus != null) {
            this.ReportStatus = new Long(source.ReportStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReportId", this.ReportId);
        this.setParamSimple(map, prefix + "ReportStatus", this.ReportStatus);

    }
}

