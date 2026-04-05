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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EdgeKVListResponse extends AbstractModel {

    /**
    * 键名列表。
    */
    @SerializedName("Keys")
    @Expose
    private String [] Keys;

    /**
    * 游标位置。标识当前遍历的位置，用于获取下一批数据。将此值填入下次请求的 Cursor 参数中，可继续向后遍历。若为空字符串，表示已遍历完所有数据。

    */
    @SerializedName("Cursor")
    @Expose
    private String Cursor;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 键名列表。 
     * @return Keys 键名列表。
     */
    public String [] getKeys() {
        return this.Keys;
    }

    /**
     * Set 键名列表。
     * @param Keys 键名列表。
     */
    public void setKeys(String [] Keys) {
        this.Keys = Keys;
    }

    /**
     * Get 游标位置。标识当前遍历的位置，用于获取下一批数据。将此值填入下次请求的 Cursor 参数中，可继续向后遍历。若为空字符串，表示已遍历完所有数据。
 
     * @return Cursor 游标位置。标识当前遍历的位置，用于获取下一批数据。将此值填入下次请求的 Cursor 参数中，可继续向后遍历。若为空字符串，表示已遍历完所有数据。

     */
    public String getCursor() {
        return this.Cursor;
    }

    /**
     * Set 游标位置。标识当前遍历的位置，用于获取下一批数据。将此值填入下次请求的 Cursor 参数中，可继续向后遍历。若为空字符串，表示已遍历完所有数据。

     * @param Cursor 游标位置。标识当前遍历的位置，用于获取下一批数据。将此值填入下次请求的 Cursor 参数中，可继续向后遍历。若为空字符串，表示已遍历完所有数据。

     */
    public void setCursor(String Cursor) {
        this.Cursor = Cursor;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public EdgeKVListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EdgeKVListResponse(EdgeKVListResponse source) {
        if (source.Keys != null) {
            this.Keys = new String[source.Keys.length];
            for (int i = 0; i < source.Keys.length; i++) {
                this.Keys[i] = new String(source.Keys[i]);
            }
        }
        if (source.Cursor != null) {
            this.Cursor = new String(source.Cursor);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Keys.", this.Keys);
        this.setParamSimple(map, prefix + "Cursor", this.Cursor);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

