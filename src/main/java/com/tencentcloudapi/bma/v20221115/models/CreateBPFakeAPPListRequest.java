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
package com.tencentcloudapi.bma.v20221115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateBPFakeAPPListRequest extends AbstractModel{

    /**
    * 批量模板
    */
    @SerializedName("FakeAPPs")
    @Expose
    private String FakeAPPs;

    /**
     * Get 批量模板 
     * @return FakeAPPs 批量模板
     */
    public String getFakeAPPs() {
        return this.FakeAPPs;
    }

    /**
     * Set 批量模板
     * @param FakeAPPs 批量模板
     */
    public void setFakeAPPs(String FakeAPPs) {
        this.FakeAPPs = FakeAPPs;
    }

    public CreateBPFakeAPPListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBPFakeAPPListRequest(CreateBPFakeAPPListRequest source) {
        if (source.FakeAPPs != null) {
            this.FakeAPPs = new String(source.FakeAPPs);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FakeAPPs", this.FakeAPPs);

    }
}

