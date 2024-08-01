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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFrontEndRequest extends AbstractModel {

    /**
    * 实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 文件类型
    */
    @SerializedName("ConfigType")
    @Expose
    private String ConfigType;

    /**
    * 参数1
    */
    @SerializedName("Param1")
    @Expose
    private String Param1;

    /**
    * 参数2
    */
    @SerializedName("Param2")
    @Expose
    private String Param2;

    /**
    * 参数3
    */
    @SerializedName("Param3")
    @Expose
    private String Param3;

    /**
    * 参数4
    */
    @SerializedName("Param4")
    @Expose
    private String Param4;

    /**
    * 参数5
    */
    @SerializedName("Param5")
    @Expose
    private String Param5;

    /**
     * Get 实例id 
     * @return InstanceId 实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
     * @param InstanceId 实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 文件类型 
     * @return ConfigType 文件类型
     */
    public String getConfigType() {
        return this.ConfigType;
    }

    /**
     * Set 文件类型
     * @param ConfigType 文件类型
     */
    public void setConfigType(String ConfigType) {
        this.ConfigType = ConfigType;
    }

    /**
     * Get 参数1 
     * @return Param1 参数1
     */
    public String getParam1() {
        return this.Param1;
    }

    /**
     * Set 参数1
     * @param Param1 参数1
     */
    public void setParam1(String Param1) {
        this.Param1 = Param1;
    }

    /**
     * Get 参数2 
     * @return Param2 参数2
     */
    public String getParam2() {
        return this.Param2;
    }

    /**
     * Set 参数2
     * @param Param2 参数2
     */
    public void setParam2(String Param2) {
        this.Param2 = Param2;
    }

    /**
     * Get 参数3 
     * @return Param3 参数3
     */
    public String getParam3() {
        return this.Param3;
    }

    /**
     * Set 参数3
     * @param Param3 参数3
     */
    public void setParam3(String Param3) {
        this.Param3 = Param3;
    }

    /**
     * Get 参数4 
     * @return Param4 参数4
     */
    public String getParam4() {
        return this.Param4;
    }

    /**
     * Set 参数4
     * @param Param4 参数4
     */
    public void setParam4(String Param4) {
        this.Param4 = Param4;
    }

    /**
     * Get 参数5 
     * @return Param5 参数5
     */
    public String getParam5() {
        return this.Param5;
    }

    /**
     * Set 参数5
     * @param Param5 参数5
     */
    public void setParam5(String Param5) {
        this.Param5 = Param5;
    }

    public DescribeFrontEndRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFrontEndRequest(DescribeFrontEndRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ConfigType != null) {
            this.ConfigType = new String(source.ConfigType);
        }
        if (source.Param1 != null) {
            this.Param1 = new String(source.Param1);
        }
        if (source.Param2 != null) {
            this.Param2 = new String(source.Param2);
        }
        if (source.Param3 != null) {
            this.Param3 = new String(source.Param3);
        }
        if (source.Param4 != null) {
            this.Param4 = new String(source.Param4);
        }
        if (source.Param5 != null) {
            this.Param5 = new String(source.Param5);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ConfigType", this.ConfigType);
        this.setParamSimple(map, prefix + "Param1", this.Param1);
        this.setParamSimple(map, prefix + "Param2", this.Param2);
        this.setParamSimple(map, prefix + "Param3", this.Param3);
        this.setParamSimple(map, prefix + "Param4", this.Param4);
        this.setParamSimple(map, prefix + "Param5", this.Param5);

    }
}

