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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAlarmAttributeRequest extends AbstractModel{

    /**
    * 告警项目。
<li>Offline：防护软件离线</li>
<li>Malware：发现木马文件</li>
<li>NonlocalLogin：发现异地登录行为</li>
<li>CrackSuccess：被暴力破解成功</li>
    */
    @SerializedName("Attribute")
    @Expose
    private String Attribute;

    /**
    * 告警项目属性。
<li>CLOSE：关闭</li>
<li>OPEN：打开</li>
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get 告警项目。
<li>Offline：防护软件离线</li>
<li>Malware：发现木马文件</li>
<li>NonlocalLogin：发现异地登录行为</li>
<li>CrackSuccess：被暴力破解成功</li> 
     * @return Attribute 告警项目。
<li>Offline：防护软件离线</li>
<li>Malware：发现木马文件</li>
<li>NonlocalLogin：发现异地登录行为</li>
<li>CrackSuccess：被暴力破解成功</li>
     */
    public String getAttribute() {
        return this.Attribute;
    }

    /**
     * Set 告警项目。
<li>Offline：防护软件离线</li>
<li>Malware：发现木马文件</li>
<li>NonlocalLogin：发现异地登录行为</li>
<li>CrackSuccess：被暴力破解成功</li>
     * @param Attribute 告警项目。
<li>Offline：防护软件离线</li>
<li>Malware：发现木马文件</li>
<li>NonlocalLogin：发现异地登录行为</li>
<li>CrackSuccess：被暴力破解成功</li>
     */
    public void setAttribute(String Attribute) {
        this.Attribute = Attribute;
    }

    /**
     * Get 告警项目属性。
<li>CLOSE：关闭</li>
<li>OPEN：打开</li> 
     * @return Value 告警项目属性。
<li>CLOSE：关闭</li>
<li>OPEN：打开</li>
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 告警项目属性。
<li>CLOSE：关闭</li>
<li>OPEN：打开</li>
     * @param Value 告警项目属性。
<li>CLOSE：关闭</li>
<li>OPEN：打开</li>
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Attribute", this.Attribute);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

