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

public class CreateCRDesktopCodeRequest extends AbstractModel{

    /**
    * xxx
    */
    @SerializedName("TortId")
    @Expose
    private Long TortId;

    /**
    * xxx
    */
    @SerializedName("DesktopCode")
    @Expose
    private String DesktopCode;

    /**
     * Get xxx 
     * @return TortId xxx
     */
    public Long getTortId() {
        return this.TortId;
    }

    /**
     * Set xxx
     * @param TortId xxx
     */
    public void setTortId(Long TortId) {
        this.TortId = TortId;
    }

    /**
     * Get xxx 
     * @return DesktopCode xxx
     */
    public String getDesktopCode() {
        return this.DesktopCode;
    }

    /**
     * Set xxx
     * @param DesktopCode xxx
     */
    public void setDesktopCode(String DesktopCode) {
        this.DesktopCode = DesktopCode;
    }

    public CreateCRDesktopCodeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCRDesktopCodeRequest(CreateCRDesktopCodeRequest source) {
        if (source.TortId != null) {
            this.TortId = new Long(source.TortId);
        }
        if (source.DesktopCode != null) {
            this.DesktopCode = new String(source.DesktopCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TortId", this.TortId);
        this.setParamSimple(map, prefix + "DesktopCode", this.DesktopCode);

    }
}

