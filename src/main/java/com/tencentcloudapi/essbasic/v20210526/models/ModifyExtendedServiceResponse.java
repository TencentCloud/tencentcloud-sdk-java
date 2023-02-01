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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyExtendedServiceResponse extends AbstractModel{

    /**
    * 操作跳转链接，有效期24小时
若操作时没有返回跳转链接，表示无需跳转操作，此时会直接开通/关闭服务。

当操作类型是 OPEN 且 扩展服务类型是  AUTO_SIGN 或 DOWNLOAD_FLOW 或者 OVERSEA_SIGN 时返回操作链接，
返回的链接需要平台方自行触达超管或法人，超管或法人点击链接完成服务开通操作。
    */
    @SerializedName("OperateUrl")
    @Expose
    private String OperateUrl;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 操作跳转链接，有效期24小时
若操作时没有返回跳转链接，表示无需跳转操作，此时会直接开通/关闭服务。

当操作类型是 OPEN 且 扩展服务类型是  AUTO_SIGN 或 DOWNLOAD_FLOW 或者 OVERSEA_SIGN 时返回操作链接，
返回的链接需要平台方自行触达超管或法人，超管或法人点击链接完成服务开通操作。 
     * @return OperateUrl 操作跳转链接，有效期24小时
若操作时没有返回跳转链接，表示无需跳转操作，此时会直接开通/关闭服务。

当操作类型是 OPEN 且 扩展服务类型是  AUTO_SIGN 或 DOWNLOAD_FLOW 或者 OVERSEA_SIGN 时返回操作链接，
返回的链接需要平台方自行触达超管或法人，超管或法人点击链接完成服务开通操作。
     */
    public String getOperateUrl() {
        return this.OperateUrl;
    }

    /**
     * Set 操作跳转链接，有效期24小时
若操作时没有返回跳转链接，表示无需跳转操作，此时会直接开通/关闭服务。

当操作类型是 OPEN 且 扩展服务类型是  AUTO_SIGN 或 DOWNLOAD_FLOW 或者 OVERSEA_SIGN 时返回操作链接，
返回的链接需要平台方自行触达超管或法人，超管或法人点击链接完成服务开通操作。
     * @param OperateUrl 操作跳转链接，有效期24小时
若操作时没有返回跳转链接，表示无需跳转操作，此时会直接开通/关闭服务。

当操作类型是 OPEN 且 扩展服务类型是  AUTO_SIGN 或 DOWNLOAD_FLOW 或者 OVERSEA_SIGN 时返回操作链接，
返回的链接需要平台方自行触达超管或法人，超管或法人点击链接完成服务开通操作。
     */
    public void setOperateUrl(String OperateUrl) {
        this.OperateUrl = OperateUrl;
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

    public ModifyExtendedServiceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyExtendedServiceResponse(ModifyExtendedServiceResponse source) {
        if (source.OperateUrl != null) {
            this.OperateUrl = new String(source.OperateUrl);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OperateUrl", this.OperateUrl);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

