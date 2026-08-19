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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SaleInfo extends AbstractModel {

    /**
    * <p>手动设置的flag标志，true表示售罄，false表示可售。</p>
    */
    @SerializedName("Flag")
    @Expose
    private Boolean Flag;

    /**
    * <p>ckafka版本号(1.1.1/2.4.2/0.10.2)</p>
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * <p>专业版、标准版标志</p>
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * <p>售罄标志：true售罄</p>
    */
    @SerializedName("SoldOut")
    @Expose
    private Boolean SoldOut;

    /**
     * Get <p>手动设置的flag标志，true表示售罄，false表示可售。</p> 
     * @return Flag <p>手动设置的flag标志，true表示售罄，false表示可售。</p>
     */
    public Boolean getFlag() {
        return this.Flag;
    }

    /**
     * Set <p>手动设置的flag标志，true表示售罄，false表示可售。</p>
     * @param Flag <p>手动设置的flag标志，true表示售罄，false表示可售。</p>
     */
    public void setFlag(Boolean Flag) {
        this.Flag = Flag;
    }

    /**
     * Get <p>ckafka版本号(1.1.1/2.4.2/0.10.2)</p> 
     * @return Version <p>ckafka版本号(1.1.1/2.4.2/0.10.2)</p>
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set <p>ckafka版本号(1.1.1/2.4.2/0.10.2)</p>
     * @param Version <p>ckafka版本号(1.1.1/2.4.2/0.10.2)</p>
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get <p>专业版、标准版标志</p> 
     * @return Platform <p>专业版、标准版标志</p>
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set <p>专业版、标准版标志</p>
     * @param Platform <p>专业版、标准版标志</p>
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get <p>售罄标志：true售罄</p> 
     * @return SoldOut <p>售罄标志：true售罄</p>
     */
    public Boolean getSoldOut() {
        return this.SoldOut;
    }

    /**
     * Set <p>售罄标志：true售罄</p>
     * @param SoldOut <p>售罄标志：true售罄</p>
     */
    public void setSoldOut(Boolean SoldOut) {
        this.SoldOut = SoldOut;
    }

    public SaleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SaleInfo(SaleInfo source) {
        if (source.Flag != null) {
            this.Flag = new Boolean(source.Flag);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.SoldOut != null) {
            this.SoldOut = new Boolean(source.SoldOut);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Flag", this.Flag);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "SoldOut", this.SoldOut);

    }
}

