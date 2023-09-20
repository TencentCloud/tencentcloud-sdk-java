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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SwitchElasticModeRequest extends AbstractModel{

    /**
    * 版本，只能是sparta-waf, clb-waf, cdn-waf
    */
    @SerializedName("Edition")
    @Expose
    private String Edition;

    /**
    * 0代表关闭，1代表打开
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
    * 实例id
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
     * Get 版本，只能是sparta-waf, clb-waf, cdn-waf 
     * @return Edition 版本，只能是sparta-waf, clb-waf, cdn-waf
     */
    public String getEdition() {
        return this.Edition;
    }

    /**
     * Set 版本，只能是sparta-waf, clb-waf, cdn-waf
     * @param Edition 版本，只能是sparta-waf, clb-waf, cdn-waf
     */
    public void setEdition(String Edition) {
        this.Edition = Edition;
    }

    /**
     * Get 0代表关闭，1代表打开 
     * @return Mode 0代表关闭，1代表打开
     */
    public Long getMode() {
        return this.Mode;
    }

    /**
     * Set 0代表关闭，1代表打开
     * @param Mode 0代表关闭，1代表打开
     */
    public void setMode(Long Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 实例id 
     * @return InstanceID 实例id
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set 实例id
     * @param InstanceID 实例id
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    public SwitchElasticModeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SwitchElasticModeRequest(SwitchElasticModeRequest source) {
        if (source.Edition != null) {
            this.Edition = new String(source.Edition);
        }
        if (source.Mode != null) {
            this.Mode = new Long(source.Mode);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Edition", this.Edition);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);

    }
}

