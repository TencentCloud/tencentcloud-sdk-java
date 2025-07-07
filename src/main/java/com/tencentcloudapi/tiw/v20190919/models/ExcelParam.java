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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExcelParam extends AbstractModel {

    /**
    * 表格转码纸张（画布）大小，默认为0。
0 -- A4
1 -- A2 
2 -- A0

注：当设置的值超出合法取值范围时，将采用默认值。
    */
    @SerializedName("PaperSize")
    @Expose
    private Long PaperSize;

    /**
    * 表格文件转换纸张方向，默认为0。
0 -- 代表垂直方向
非0 -- 代表水平方向
    */
    @SerializedName("PaperDirection")
    @Expose
    private Long PaperDirection;

    /**
     * Get 表格转码纸张（画布）大小，默认为0。
0 -- A4
1 -- A2 
2 -- A0

注：当设置的值超出合法取值范围时，将采用默认值。 
     * @return PaperSize 表格转码纸张（画布）大小，默认为0。
0 -- A4
1 -- A2 
2 -- A0

注：当设置的值超出合法取值范围时，将采用默认值。
     */
    public Long getPaperSize() {
        return this.PaperSize;
    }

    /**
     * Set 表格转码纸张（画布）大小，默认为0。
0 -- A4
1 -- A2 
2 -- A0

注：当设置的值超出合法取值范围时，将采用默认值。
     * @param PaperSize 表格转码纸张（画布）大小，默认为0。
0 -- A4
1 -- A2 
2 -- A0

注：当设置的值超出合法取值范围时，将采用默认值。
     */
    public void setPaperSize(Long PaperSize) {
        this.PaperSize = PaperSize;
    }

    /**
     * Get 表格文件转换纸张方向，默认为0。
0 -- 代表垂直方向
非0 -- 代表水平方向 
     * @return PaperDirection 表格文件转换纸张方向，默认为0。
0 -- 代表垂直方向
非0 -- 代表水平方向
     */
    public Long getPaperDirection() {
        return this.PaperDirection;
    }

    /**
     * Set 表格文件转换纸张方向，默认为0。
0 -- 代表垂直方向
非0 -- 代表水平方向
     * @param PaperDirection 表格文件转换纸张方向，默认为0。
0 -- 代表垂直方向
非0 -- 代表水平方向
     */
    public void setPaperDirection(Long PaperDirection) {
        this.PaperDirection = PaperDirection;
    }

    public ExcelParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExcelParam(ExcelParam source) {
        if (source.PaperSize != null) {
            this.PaperSize = new Long(source.PaperSize);
        }
        if (source.PaperDirection != null) {
            this.PaperDirection = new Long(source.PaperDirection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PaperSize", this.PaperSize);
        this.setParamSimple(map, prefix + "PaperDirection", this.PaperDirection);

    }
}

