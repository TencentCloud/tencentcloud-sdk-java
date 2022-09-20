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

public class SpeedTestingStatus extends AbstractModel{

    /**
    * 拨测 url。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 拨测 url 是否使用 https。
    */
    @SerializedName("Tls")
    @Expose
    private Boolean Tls;

    /**
    * 任务创建时间。
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
    * 任务状态，取值有：
<li> 200：任务完成;</li>
<li> 100：任务进行中。</li>
<li> 503: 任务失败。</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatusCode")
    @Expose
    private Long StatusCode;

    /**
    * 拨测 UA。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UA")
    @Expose
    private String UA;

    /**
    * 网络环境。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Connectivity")
    @Expose
    private String Connectivity;

    /**
    * 是否可达，取值：
<li> true：可达；</li>
<li> false：不可达。</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Reachable")
    @Expose
    private Boolean Reachable;

    /**
    * 是否超时，取值：
<li> true：超时；</li>
<li> false：不超时。</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimedOut")
    @Expose
    private Boolean TimedOut;

    /**
     * Get 拨测 url。 
     * @return Url 拨测 url。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 拨测 url。
     * @param Url 拨测 url。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 拨测 url 是否使用 https。 
     * @return Tls 拨测 url 是否使用 https。
     */
    public Boolean getTls() {
        return this.Tls;
    }

    /**
     * Set 拨测 url 是否使用 https。
     * @param Tls 拨测 url 是否使用 https。
     */
    public void setTls(Boolean Tls) {
        this.Tls = Tls;
    }

    /**
     * Get 任务创建时间。 
     * @return CreatedOn 任务创建时间。
     */
    public String getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set 任务创建时间。
     * @param CreatedOn 任务创建时间。
     */
    public void setCreatedOn(String CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get 任务状态，取值有：
<li> 200：任务完成;</li>
<li> 100：任务进行中。</li>
<li> 503: 任务失败。</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatusCode 任务状态，取值有：
<li> 200：任务完成;</li>
<li> 100：任务进行中。</li>
<li> 503: 任务失败。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatusCode() {
        return this.StatusCode;
    }

    /**
     * Set 任务状态，取值有：
<li> 200：任务完成;</li>
<li> 100：任务进行中。</li>
<li> 503: 任务失败。</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatusCode 任务状态，取值有：
<li> 200：任务完成;</li>
<li> 100：任务进行中。</li>
<li> 503: 任务失败。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatusCode(Long StatusCode) {
        this.StatusCode = StatusCode;
    }

    /**
     * Get 拨测 UA。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UA 拨测 UA。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUA() {
        return this.UA;
    }

    /**
     * Set 拨测 UA。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UA 拨测 UA。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUA(String UA) {
        this.UA = UA;
    }

    /**
     * Get 网络环境。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Connectivity 网络环境。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConnectivity() {
        return this.Connectivity;
    }

    /**
     * Set 网络环境。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Connectivity 网络环境。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConnectivity(String Connectivity) {
        this.Connectivity = Connectivity;
    }

    /**
     * Get 是否可达，取值：
<li> true：可达；</li>
<li> false：不可达。</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Reachable 是否可达，取值：
<li> true：可达；</li>
<li> false：不可达。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getReachable() {
        return this.Reachable;
    }

    /**
     * Set 是否可达，取值：
<li> true：可达；</li>
<li> false：不可达。</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Reachable 是否可达，取值：
<li> true：可达；</li>
<li> false：不可达。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReachable(Boolean Reachable) {
        this.Reachable = Reachable;
    }

    /**
     * Get 是否超时，取值：
<li> true：超时；</li>
<li> false：不超时。</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimedOut 是否超时，取值：
<li> true：超时；</li>
<li> false：不超时。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getTimedOut() {
        return this.TimedOut;
    }

    /**
     * Set 是否超时，取值：
<li> true：超时；</li>
<li> false：不超时。</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimedOut 是否超时，取值：
<li> true：超时；</li>
<li> false：不超时。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimedOut(Boolean TimedOut) {
        this.TimedOut = TimedOut;
    }

    public SpeedTestingStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SpeedTestingStatus(SpeedTestingStatus source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Tls != null) {
            this.Tls = new Boolean(source.Tls);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new String(source.CreatedOn);
        }
        if (source.StatusCode != null) {
            this.StatusCode = new Long(source.StatusCode);
        }
        if (source.UA != null) {
            this.UA = new String(source.UA);
        }
        if (source.Connectivity != null) {
            this.Connectivity = new String(source.Connectivity);
        }
        if (source.Reachable != null) {
            this.Reachable = new Boolean(source.Reachable);
        }
        if (source.TimedOut != null) {
            this.TimedOut = new Boolean(source.TimedOut);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Tls", this.Tls);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "StatusCode", this.StatusCode);
        this.setParamSimple(map, prefix + "UA", this.UA);
        this.setParamSimple(map, prefix + "Connectivity", this.Connectivity);
        this.setParamSimple(map, prefix + "Reachable", this.Reachable);
        this.setParamSimple(map, prefix + "TimedOut", this.TimedOut);

    }
}

