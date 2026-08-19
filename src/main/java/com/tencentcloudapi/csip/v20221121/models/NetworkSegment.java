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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NetworkSegment extends AbstractModel {

    /**
    * <p>网段</p>
    */
    @SerializedName("Segment")
    @Expose
    private String Segment;

    /**
    * <p>描述</p>
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
     * Get <p>网段</p> 
     * @return Segment <p>网段</p>
     */
    public String getSegment() {
        return this.Segment;
    }

    /**
     * Set <p>网段</p>
     * @param Segment <p>网段</p>
     */
    public void setSegment(String Segment) {
        this.Segment = Segment;
    }

    /**
     * Get <p>描述</p> 
     * @return Desc <p>描述</p>
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set <p>描述</p>
     * @param Desc <p>描述</p>
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    public NetworkSegment() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NetworkSegment(NetworkSegment source) {
        if (source.Segment != null) {
            this.Segment = new String(source.Segment);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Segment", this.Segment);
        this.setParamSimple(map, prefix + "Desc", this.Desc);

    }
}

