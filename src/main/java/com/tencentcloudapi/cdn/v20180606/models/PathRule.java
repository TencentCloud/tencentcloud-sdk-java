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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PathRule extends AbstractModel{

    /**
    * 是否是正则匹配。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Regex")
    @Expose
    private Boolean Regex;

    /**
    * URL路径。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 路径匹配时的回源源站。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Origin")
    @Expose
    private String Origin;

    /**
    * 路径匹配时的回源Host头部。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServerName")
    @Expose
    private String ServerName;

    /**
    * 源站所属区域，支持CN，OV。分别表示国内或海外。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriginArea")
    @Expose
    private String OriginArea;

    /**
    * 路径匹配时的回源URI路径。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ForwardUri")
    @Expose
    private String ForwardUri;

    /**
    * 路径匹配时的回源头部设置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RequestHeaders")
    @Expose
    private HttpHeaderRule [] RequestHeaders;

    /**
     * Get 是否是正则匹配。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Regex 是否是正则匹配。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getRegex() {
        return this.Regex;
    }

    /**
     * Set 是否是正则匹配。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Regex 是否是正则匹配。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegex(Boolean Regex) {
        this.Regex = Regex;
    }

    /**
     * Get URL路径。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Path URL路径。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set URL路径。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Path URL路径。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 路径匹配时的回源源站。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Origin 路径匹配时的回源源站。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrigin() {
        return this.Origin;
    }

    /**
     * Set 路径匹配时的回源源站。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Origin 路径匹配时的回源源站。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }

    /**
     * Get 路径匹配时的回源Host头部。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServerName 路径匹配时的回源Host头部。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServerName() {
        return this.ServerName;
    }

    /**
     * Set 路径匹配时的回源Host头部。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServerName 路径匹配时的回源Host头部。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServerName(String ServerName) {
        this.ServerName = ServerName;
    }

    /**
     * Get 源站所属区域，支持CN，OV。分别表示国内或海外。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriginArea 源站所属区域，支持CN，OV。分别表示国内或海外。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOriginArea() {
        return this.OriginArea;
    }

    /**
     * Set 源站所属区域，支持CN，OV。分别表示国内或海外。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriginArea 源站所属区域，支持CN，OV。分别表示国内或海外。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriginArea(String OriginArea) {
        this.OriginArea = OriginArea;
    }

    /**
     * Get 路径匹配时的回源URI路径。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ForwardUri 路径匹配时的回源URI路径。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getForwardUri() {
        return this.ForwardUri;
    }

    /**
     * Set 路径匹配时的回源URI路径。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ForwardUri 路径匹配时的回源URI路径。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setForwardUri(String ForwardUri) {
        this.ForwardUri = ForwardUri;
    }

    /**
     * Get 路径匹配时的回源头部设置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RequestHeaders 路径匹配时的回源头部设置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HttpHeaderRule [] getRequestHeaders() {
        return this.RequestHeaders;
    }

    /**
     * Set 路径匹配时的回源头部设置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RequestHeaders 路径匹配时的回源头部设置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRequestHeaders(HttpHeaderRule [] RequestHeaders) {
        this.RequestHeaders = RequestHeaders;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Regex", this.Regex);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Origin", this.Origin);
        this.setParamSimple(map, prefix + "ServerName", this.ServerName);
        this.setParamSimple(map, prefix + "OriginArea", this.OriginArea);
        this.setParamSimple(map, prefix + "ForwardUri", this.ForwardUri);
        this.setParamArrayObj(map, prefix + "RequestHeaders.", this.RequestHeaders);

    }
}

