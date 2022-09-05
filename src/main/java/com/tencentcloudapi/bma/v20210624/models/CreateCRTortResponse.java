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
package com.tencentcloudapi.bma.v20210624.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCRTortResponse extends AbstractModel{

    /**
    * xx
    */
    @SerializedName("WorkId")
    @Expose
    private Long WorkId;

    /**
    * xx
    */
    @SerializedName("TortId")
    @Expose
    private Long TortId;

    /**
    * xx
    */
    @SerializedName("TortTitle")
    @Expose
    private String TortTitle;

    /**
    * xx
    */
    @SerializedName("TortPlat")
    @Expose
    private String TortPlat;

    /**
    * xx
    */
    @SerializedName("TortURL")
    @Expose
    private String TortURL;

    /**
    * xx
    */
    @SerializedName("TortDomain")
    @Expose
    private String TortDomain;

    /**
    * xx
    */
    @SerializedName("TortBodyName")
    @Expose
    private String TortBodyName;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get xx 
     * @return WorkId xx
     */
    public Long getWorkId() {
        return this.WorkId;
    }

    /**
     * Set xx
     * @param WorkId xx
     */
    public void setWorkId(Long WorkId) {
        this.WorkId = WorkId;
    }

    /**
     * Get xx 
     * @return TortId xx
     */
    public Long getTortId() {
        return this.TortId;
    }

    /**
     * Set xx
     * @param TortId xx
     */
    public void setTortId(Long TortId) {
        this.TortId = TortId;
    }

    /**
     * Get xx 
     * @return TortTitle xx
     */
    public String getTortTitle() {
        return this.TortTitle;
    }

    /**
     * Set xx
     * @param TortTitle xx
     */
    public void setTortTitle(String TortTitle) {
        this.TortTitle = TortTitle;
    }

    /**
     * Get xx 
     * @return TortPlat xx
     */
    public String getTortPlat() {
        return this.TortPlat;
    }

    /**
     * Set xx
     * @param TortPlat xx
     */
    public void setTortPlat(String TortPlat) {
        this.TortPlat = TortPlat;
    }

    /**
     * Get xx 
     * @return TortURL xx
     */
    public String getTortURL() {
        return this.TortURL;
    }

    /**
     * Set xx
     * @param TortURL xx
     */
    public void setTortURL(String TortURL) {
        this.TortURL = TortURL;
    }

    /**
     * Get xx 
     * @return TortDomain xx
     */
    public String getTortDomain() {
        return this.TortDomain;
    }

    /**
     * Set xx
     * @param TortDomain xx
     */
    public void setTortDomain(String TortDomain) {
        this.TortDomain = TortDomain;
    }

    /**
     * Get xx 
     * @return TortBodyName xx
     */
    public String getTortBodyName() {
        return this.TortBodyName;
    }

    /**
     * Set xx
     * @param TortBodyName xx
     */
    public void setTortBodyName(String TortBodyName) {
        this.TortBodyName = TortBodyName;
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

    public CreateCRTortResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCRTortResponse(CreateCRTortResponse source) {
        if (source.WorkId != null) {
            this.WorkId = new Long(source.WorkId);
        }
        if (source.TortId != null) {
            this.TortId = new Long(source.TortId);
        }
        if (source.TortTitle != null) {
            this.TortTitle = new String(source.TortTitle);
        }
        if (source.TortPlat != null) {
            this.TortPlat = new String(source.TortPlat);
        }
        if (source.TortURL != null) {
            this.TortURL = new String(source.TortURL);
        }
        if (source.TortDomain != null) {
            this.TortDomain = new String(source.TortDomain);
        }
        if (source.TortBodyName != null) {
            this.TortBodyName = new String(source.TortBodyName);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkId", this.WorkId);
        this.setParamSimple(map, prefix + "TortId", this.TortId);
        this.setParamSimple(map, prefix + "TortTitle", this.TortTitle);
        this.setParamSimple(map, prefix + "TortPlat", this.TortPlat);
        this.setParamSimple(map, prefix + "TortURL", this.TortURL);
        this.setParamSimple(map, prefix + "TortDomain", this.TortDomain);
        this.setParamSimple(map, prefix + "TortBodyName", this.TortBodyName);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

