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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IdentifyZoneResponse extends AbstractModel{

    /**
    * 站点归属校验：Dns校验信息。
    */
    @SerializedName("Ascription")
    @Expose
    private AscriptionInfo Ascription;

    /**
    * 站点归属权校验：文件校验信息。
    */
    @SerializedName("FileAscription")
    @Expose
    private FileAscriptionInfo FileAscription;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 站点归属校验：Dns校验信息。 
     * @return Ascription 站点归属校验：Dns校验信息。
     */
    public AscriptionInfo getAscription() {
        return this.Ascription;
    }

    /**
     * Set 站点归属校验：Dns校验信息。
     * @param Ascription 站点归属校验：Dns校验信息。
     */
    public void setAscription(AscriptionInfo Ascription) {
        this.Ascription = Ascription;
    }

    /**
     * Get 站点归属权校验：文件校验信息。 
     * @return FileAscription 站点归属权校验：文件校验信息。
     */
    public FileAscriptionInfo getFileAscription() {
        return this.FileAscription;
    }

    /**
     * Set 站点归属权校验：文件校验信息。
     * @param FileAscription 站点归属权校验：文件校验信息。
     */
    public void setFileAscription(FileAscriptionInfo FileAscription) {
        this.FileAscription = FileAscription;
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

    public IdentifyZoneResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IdentifyZoneResponse(IdentifyZoneResponse source) {
        if (source.Ascription != null) {
            this.Ascription = new AscriptionInfo(source.Ascription);
        }
        if (source.FileAscription != null) {
            this.FileAscription = new FileAscriptionInfo(source.FileAscription);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Ascription.", this.Ascription);
        this.setParamObj(map, prefix + "FileAscription.", this.FileAscription);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

