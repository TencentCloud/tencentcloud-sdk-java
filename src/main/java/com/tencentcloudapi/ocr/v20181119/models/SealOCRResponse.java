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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SealOCRResponse extends AbstractModel{

    /**
    * 印章内容
    */
    @SerializedName("SealBody")
    @Expose
    private String SealBody;

    /**
    * 印章坐标
    */
    @SerializedName("Location")
    @Expose
    private Rect Location;

    /**
    * 其它文本内容
    */
    @SerializedName("OtherTexts")
    @Expose
    private String [] OtherTexts;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 印章内容 
     * @return SealBody 印章内容
     */
    public String getSealBody() {
        return this.SealBody;
    }

    /**
     * Set 印章内容
     * @param SealBody 印章内容
     */
    public void setSealBody(String SealBody) {
        this.SealBody = SealBody;
    }

    /**
     * Get 印章坐标 
     * @return Location 印章坐标
     */
    public Rect getLocation() {
        return this.Location;
    }

    /**
     * Set 印章坐标
     * @param Location 印章坐标
     */
    public void setLocation(Rect Location) {
        this.Location = Location;
    }

    /**
     * Get 其它文本内容 
     * @return OtherTexts 其它文本内容
     */
    public String [] getOtherTexts() {
        return this.OtherTexts;
    }

    /**
     * Set 其它文本内容
     * @param OtherTexts 其它文本内容
     */
    public void setOtherTexts(String [] OtherTexts) {
        this.OtherTexts = OtherTexts;
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
        this.setParamSimple(map, prefix + "SealBody", this.SealBody);
        this.setParamObj(map, prefix + "Location.", this.Location);
        this.setParamArraySimple(map, prefix + "OtherTexts.", this.OtherTexts);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

