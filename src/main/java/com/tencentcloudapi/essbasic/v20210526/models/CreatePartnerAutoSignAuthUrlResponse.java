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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePartnerAutoSignAuthUrlResponse extends AbstractModel {

    /**
    * 授权链接，以短链形式返回，短链的有效期参考回参中的 ExpiredTime。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 从客户小程序或者客户APP跳转至腾讯电子签小程序进行批量签署的跳转路径

    */
    @SerializedName("MiniAppPath")
    @Expose
    private String MiniAppPath;

    /**
    * 链接过期时间以 Unix 时间戳格式表示，从生成链接时间起，往后7天有效期。过期后短链将失效，无法打开。
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 授权链接，以短链形式返回，短链的有效期参考回参中的 ExpiredTime。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Url 授权链接，以短链形式返回，短链的有效期参考回参中的 ExpiredTime。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 授权链接，以短链形式返回，短链的有效期参考回参中的 ExpiredTime。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Url 授权链接，以短链形式返回，短链的有效期参考回参中的 ExpiredTime。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 从客户小程序或者客户APP跳转至腾讯电子签小程序进行批量签署的跳转路径
 
     * @return MiniAppPath 从客户小程序或者客户APP跳转至腾讯电子签小程序进行批量签署的跳转路径

     */
    public String getMiniAppPath() {
        return this.MiniAppPath;
    }

    /**
     * Set 从客户小程序或者客户APP跳转至腾讯电子签小程序进行批量签署的跳转路径

     * @param MiniAppPath 从客户小程序或者客户APP跳转至腾讯电子签小程序进行批量签署的跳转路径

     */
    public void setMiniAppPath(String MiniAppPath) {
        this.MiniAppPath = MiniAppPath;
    }

    /**
     * Get 链接过期时间以 Unix 时间戳格式表示，从生成链接时间起，往后7天有效期。过期后短链将失效，无法打开。 
     * @return ExpireTime 链接过期时间以 Unix 时间戳格式表示，从生成链接时间起，往后7天有效期。过期后短链将失效，无法打开。
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 链接过期时间以 Unix 时间戳格式表示，从生成链接时间起，往后7天有效期。过期后短链将失效，无法打开。
     * @param ExpireTime 链接过期时间以 Unix 时间戳格式表示，从生成链接时间起，往后7天有效期。过期后短链将失效，无法打开。
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public CreatePartnerAutoSignAuthUrlResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePartnerAutoSignAuthUrlResponse(CreatePartnerAutoSignAuthUrlResponse source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.MiniAppPath != null) {
            this.MiniAppPath = new String(source.MiniAppPath);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "MiniAppPath", this.MiniAppPath);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

