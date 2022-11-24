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
package com.tencentcloudapi.tcm.v20210413.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAccessLogConfigResponse extends AbstractModel{

    /**
    * 访问日志输出路径。默认 /dev/stdout
    */
    @SerializedName("File")
    @Expose
    private String File;

    /**
    * 访问日志的格式。
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * 访问日志输出编码。默认 “TEXT”。除此之外还有“JSON”
    */
    @SerializedName("Encoding")
    @Expose
    private String Encoding;

    /**
    * 选中的范围
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SelectedRange")
    @Expose
    private SelectedRange SelectedRange;

    /**
    * 采用的模板，可取值为"istio, trace，默认为istio
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Template")
    @Expose
    private String Template;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 访问日志输出路径。默认 /dev/stdout 
     * @return File 访问日志输出路径。默认 /dev/stdout
     */
    public String getFile() {
        return this.File;
    }

    /**
     * Set 访问日志输出路径。默认 /dev/stdout
     * @param File 访问日志输出路径。默认 /dev/stdout
     */
    public void setFile(String File) {
        this.File = File;
    }

    /**
     * Get 访问日志的格式。 
     * @return Format 访问日志的格式。
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set 访问日志的格式。
     * @param Format 访问日志的格式。
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get 访问日志输出编码。默认 “TEXT”。除此之外还有“JSON” 
     * @return Encoding 访问日志输出编码。默认 “TEXT”。除此之外还有“JSON”
     */
    public String getEncoding() {
        return this.Encoding;
    }

    /**
     * Set 访问日志输出编码。默认 “TEXT”。除此之外还有“JSON”
     * @param Encoding 访问日志输出编码。默认 “TEXT”。除此之外还有“JSON”
     */
    public void setEncoding(String Encoding) {
        this.Encoding = Encoding;
    }

    /**
     * Get 选中的范围
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SelectedRange 选中的范围
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SelectedRange getSelectedRange() {
        return this.SelectedRange;
    }

    /**
     * Set 选中的范围
注意：此字段可能返回 null，表示取不到有效值。
     * @param SelectedRange 选中的范围
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSelectedRange(SelectedRange SelectedRange) {
        this.SelectedRange = SelectedRange;
    }

    /**
     * Get 采用的模板，可取值为"istio, trace，默认为istio
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Template 采用的模板，可取值为"istio, trace，默认为istio
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTemplate() {
        return this.Template;
    }

    /**
     * Set 采用的模板，可取值为"istio, trace，默认为istio
注意：此字段可能返回 null，表示取不到有效值。
     * @param Template 采用的模板，可取值为"istio, trace，默认为istio
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTemplate(String Template) {
        this.Template = Template;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeAccessLogConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAccessLogConfigResponse(DescribeAccessLogConfigResponse source) {
        if (source.File != null) {
            this.File = new String(source.File);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.Encoding != null) {
            this.Encoding = new String(source.Encoding);
        }
        if (source.SelectedRange != null) {
            this.SelectedRange = new SelectedRange(source.SelectedRange);
        }
        if (source.Template != null) {
            this.Template = new String(source.Template);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "File", this.File);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "Encoding", this.Encoding);
        this.setParamObj(map, prefix + "SelectedRange.", this.SelectedRange);
        this.setParamSimple(map, prefix + "Template", this.Template);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

