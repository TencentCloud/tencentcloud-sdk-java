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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListFilesResponse extends AbstractModel {

    /**
    * 响应条目是否被截断。
    */
    @SerializedName("IsTruncated")
    @Expose
    private Boolean IsTruncated;

    /**
    * 仅当响应条目有截断（IsTruncated 为 true）才会返回该节点，该节点的值为当前响应条目中的最后一个对象键，当需要继续请求后续条目时，将该节点的值作为下一次请求的 marker 参数传入。
    */
    @SerializedName("NextMarker")
    @Expose
    private String NextMarker;

    /**
    * 从 prefix 或从头（如未指定 prefix）到首个 delimiter 之间相同的部分，定义为 Common Prefix。仅当请求中指定了 delimiter 参数才有可能返回该节点。
    */
    @SerializedName("CommonPrefixes")
    @Expose
    private String [] CommonPrefixes;

    /**
    * 对象条目。
    */
    @SerializedName("Contents")
    @Expose
    private FileContent [] Contents;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 响应条目是否被截断。 
     * @return IsTruncated 响应条目是否被截断。
     */
    public Boolean getIsTruncated() {
        return this.IsTruncated;
    }

    /**
     * Set 响应条目是否被截断。
     * @param IsTruncated 响应条目是否被截断。
     */
    public void setIsTruncated(Boolean IsTruncated) {
        this.IsTruncated = IsTruncated;
    }

    /**
     * Get 仅当响应条目有截断（IsTruncated 为 true）才会返回该节点，该节点的值为当前响应条目中的最后一个对象键，当需要继续请求后续条目时，将该节点的值作为下一次请求的 marker 参数传入。 
     * @return NextMarker 仅当响应条目有截断（IsTruncated 为 true）才会返回该节点，该节点的值为当前响应条目中的最后一个对象键，当需要继续请求后续条目时，将该节点的值作为下一次请求的 marker 参数传入。
     */
    public String getNextMarker() {
        return this.NextMarker;
    }

    /**
     * Set 仅当响应条目有截断（IsTruncated 为 true）才会返回该节点，该节点的值为当前响应条目中的最后一个对象键，当需要继续请求后续条目时，将该节点的值作为下一次请求的 marker 参数传入。
     * @param NextMarker 仅当响应条目有截断（IsTruncated 为 true）才会返回该节点，该节点的值为当前响应条目中的最后一个对象键，当需要继续请求后续条目时，将该节点的值作为下一次请求的 marker 参数传入。
     */
    public void setNextMarker(String NextMarker) {
        this.NextMarker = NextMarker;
    }

    /**
     * Get 从 prefix 或从头（如未指定 prefix）到首个 delimiter 之间相同的部分，定义为 Common Prefix。仅当请求中指定了 delimiter 参数才有可能返回该节点。 
     * @return CommonPrefixes 从 prefix 或从头（如未指定 prefix）到首个 delimiter 之间相同的部分，定义为 Common Prefix。仅当请求中指定了 delimiter 参数才有可能返回该节点。
     */
    public String [] getCommonPrefixes() {
        return this.CommonPrefixes;
    }

    /**
     * Set 从 prefix 或从头（如未指定 prefix）到首个 delimiter 之间相同的部分，定义为 Common Prefix。仅当请求中指定了 delimiter 参数才有可能返回该节点。
     * @param CommonPrefixes 从 prefix 或从头（如未指定 prefix）到首个 delimiter 之间相同的部分，定义为 Common Prefix。仅当请求中指定了 delimiter 参数才有可能返回该节点。
     */
    public void setCommonPrefixes(String [] CommonPrefixes) {
        this.CommonPrefixes = CommonPrefixes;
    }

    /**
     * Get 对象条目。 
     * @return Contents 对象条目。
     */
    public FileContent [] getContents() {
        return this.Contents;
    }

    /**
     * Set 对象条目。
     * @param Contents 对象条目。
     */
    public void setContents(FileContent [] Contents) {
        this.Contents = Contents;
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

    public ListFilesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListFilesResponse(ListFilesResponse source) {
        if (source.IsTruncated != null) {
            this.IsTruncated = new Boolean(source.IsTruncated);
        }
        if (source.NextMarker != null) {
            this.NextMarker = new String(source.NextMarker);
        }
        if (source.CommonPrefixes != null) {
            this.CommonPrefixes = new String[source.CommonPrefixes.length];
            for (int i = 0; i < source.CommonPrefixes.length; i++) {
                this.CommonPrefixes[i] = new String(source.CommonPrefixes[i]);
            }
        }
        if (source.Contents != null) {
            this.Contents = new FileContent[source.Contents.length];
            for (int i = 0; i < source.Contents.length; i++) {
                this.Contents[i] = new FileContent(source.Contents[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsTruncated", this.IsTruncated);
        this.setParamSimple(map, prefix + "NextMarker", this.NextMarker);
        this.setParamArraySimple(map, prefix + "CommonPrefixes.", this.CommonPrefixes);
        this.setParamArrayObj(map, prefix + "Contents.", this.Contents);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

