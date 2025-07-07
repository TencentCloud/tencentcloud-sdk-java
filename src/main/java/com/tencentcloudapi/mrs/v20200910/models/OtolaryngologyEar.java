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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OtolaryngologyEar extends AbstractModel {

    /**
    * 耳总体描述
    */
    @SerializedName("Text")
    @Expose
    private KeyValueItem Text;

    /**
    * 听力
    */
    @SerializedName("Hearing")
    @Expose
    private HearingItem Hearing;

    /**
     * Get 耳总体描述 
     * @return Text 耳总体描述
     */
    public KeyValueItem getText() {
        return this.Text;
    }

    /**
     * Set 耳总体描述
     * @param Text 耳总体描述
     */
    public void setText(KeyValueItem Text) {
        this.Text = Text;
    }

    /**
     * Get 听力 
     * @return Hearing 听力
     */
    public HearingItem getHearing() {
        return this.Hearing;
    }

    /**
     * Set 听力
     * @param Hearing 听力
     */
    public void setHearing(HearingItem Hearing) {
        this.Hearing = Hearing;
    }

    public OtolaryngologyEar() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OtolaryngologyEar(OtolaryngologyEar source) {
        if (source.Text != null) {
            this.Text = new KeyValueItem(source.Text);
        }
        if (source.Hearing != null) {
            this.Hearing = new HearingItem(source.Hearing);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Text.", this.Text);
        this.setParamObj(map, prefix + "Hearing.", this.Hearing);

    }
}

