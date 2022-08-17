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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DDoSStatusInfo extends AbstractModel{

    /**
    * 暂不支持，默认值off。
    */
    @SerializedName("AiStatus")
    @Expose
    private String AiStatus;

    /**
    * 废弃字段。
    */
    @SerializedName("Appid")
    @Expose
    private String Appid;

    /**
    * 策略等级，取值有:
<li>low ：宽松 ；</li>
<li>middle ：适中 ；</li>
<li>high : 严格。 </li>
    */
    @SerializedName("PlyLevel")
    @Expose
    private String PlyLevel;

    /**
     * Get 暂不支持，默认值off。 
     * @return AiStatus 暂不支持，默认值off。
     */
    public String getAiStatus() {
        return this.AiStatus;
    }

    /**
     * Set 暂不支持，默认值off。
     * @param AiStatus 暂不支持，默认值off。
     */
    public void setAiStatus(String AiStatus) {
        this.AiStatus = AiStatus;
    }

    /**
     * Get 废弃字段。 
     * @return Appid 废弃字段。
     */
    public String getAppid() {
        return this.Appid;
    }

    /**
     * Set 废弃字段。
     * @param Appid 废弃字段。
     */
    public void setAppid(String Appid) {
        this.Appid = Appid;
    }

    /**
     * Get 策略等级，取值有:
<li>low ：宽松 ；</li>
<li>middle ：适中 ；</li>
<li>high : 严格。 </li> 
     * @return PlyLevel 策略等级，取值有:
<li>low ：宽松 ；</li>
<li>middle ：适中 ；</li>
<li>high : 严格。 </li>
     */
    public String getPlyLevel() {
        return this.PlyLevel;
    }

    /**
     * Set 策略等级，取值有:
<li>low ：宽松 ；</li>
<li>middle ：适中 ；</li>
<li>high : 严格。 </li>
     * @param PlyLevel 策略等级，取值有:
<li>low ：宽松 ；</li>
<li>middle ：适中 ；</li>
<li>high : 严格。 </li>
     */
    public void setPlyLevel(String PlyLevel) {
        this.PlyLevel = PlyLevel;
    }

    public DDoSStatusInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DDoSStatusInfo(DDoSStatusInfo source) {
        if (source.AiStatus != null) {
            this.AiStatus = new String(source.AiStatus);
        }
        if (source.Appid != null) {
            this.Appid = new String(source.Appid);
        }
        if (source.PlyLevel != null) {
            this.PlyLevel = new String(source.PlyLevel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AiStatus", this.AiStatus);
        this.setParamSimple(map, prefix + "Appid", this.Appid);
        this.setParamSimple(map, prefix + "PlyLevel", this.PlyLevel);

    }
}

