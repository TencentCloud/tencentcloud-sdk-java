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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EventFrame extends AbstractModel {

    /**
    * <p>绝对路径</p>
    */
    @SerializedName("AbsPath")
    @Expose
    private String AbsPath;

    /**
    * <p>列号</p>
    */
    @SerializedName("ColNo")
    @Expose
    private Long ColNo;

    /**
    * <p>文件名</p>
    */
    @SerializedName("Filename")
    @Expose
    private String Filename;

    /**
    * <p>函数名</p>
    */
    @SerializedName("Function")
    @Expose
    private String Function;

    /**
    * <p>行号</p>
    */
    @SerializedName("LineNo")
    @Expose
    private Long LineNo;

    /**
    * <p>是否应用内 0/1</p>
    */
    @SerializedName("InApp")
    @Expose
    private Long InApp;

    /**
    * <p>模块</p>
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * <p>包名</p>
    */
    @SerializedName("Package")
    @Expose
    private String Package;

    /**
    * <p>栈层级</p>
    */
    @SerializedName("StackLevel")
    @Expose
    private Long StackLevel;

    /**
     * Get <p>绝对路径</p> 
     * @return AbsPath <p>绝对路径</p>
     */
    public String getAbsPath() {
        return this.AbsPath;
    }

    /**
     * Set <p>绝对路径</p>
     * @param AbsPath <p>绝对路径</p>
     */
    public void setAbsPath(String AbsPath) {
        this.AbsPath = AbsPath;
    }

    /**
     * Get <p>列号</p> 
     * @return ColNo <p>列号</p>
     */
    public Long getColNo() {
        return this.ColNo;
    }

    /**
     * Set <p>列号</p>
     * @param ColNo <p>列号</p>
     */
    public void setColNo(Long ColNo) {
        this.ColNo = ColNo;
    }

    /**
     * Get <p>文件名</p> 
     * @return Filename <p>文件名</p>
     */
    public String getFilename() {
        return this.Filename;
    }

    /**
     * Set <p>文件名</p>
     * @param Filename <p>文件名</p>
     */
    public void setFilename(String Filename) {
        this.Filename = Filename;
    }

    /**
     * Get <p>函数名</p> 
     * @return Function <p>函数名</p>
     */
    public String getFunction() {
        return this.Function;
    }

    /**
     * Set <p>函数名</p>
     * @param Function <p>函数名</p>
     */
    public void setFunction(String Function) {
        this.Function = Function;
    }

    /**
     * Get <p>行号</p> 
     * @return LineNo <p>行号</p>
     */
    public Long getLineNo() {
        return this.LineNo;
    }

    /**
     * Set <p>行号</p>
     * @param LineNo <p>行号</p>
     */
    public void setLineNo(Long LineNo) {
        this.LineNo = LineNo;
    }

    /**
     * Get <p>是否应用内 0/1</p> 
     * @return InApp <p>是否应用内 0/1</p>
     */
    public Long getInApp() {
        return this.InApp;
    }

    /**
     * Set <p>是否应用内 0/1</p>
     * @param InApp <p>是否应用内 0/1</p>
     */
    public void setInApp(Long InApp) {
        this.InApp = InApp;
    }

    /**
     * Get <p>模块</p> 
     * @return Module <p>模块</p>
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set <p>模块</p>
     * @param Module <p>模块</p>
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get <p>包名</p> 
     * @return Package <p>包名</p>
     */
    public String getPackage() {
        return this.Package;
    }

    /**
     * Set <p>包名</p>
     * @param Package <p>包名</p>
     */
    public void setPackage(String Package) {
        this.Package = Package;
    }

    /**
     * Get <p>栈层级</p> 
     * @return StackLevel <p>栈层级</p>
     */
    public Long getStackLevel() {
        return this.StackLevel;
    }

    /**
     * Set <p>栈层级</p>
     * @param StackLevel <p>栈层级</p>
     */
    public void setStackLevel(Long StackLevel) {
        this.StackLevel = StackLevel;
    }

    public EventFrame() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventFrame(EventFrame source) {
        if (source.AbsPath != null) {
            this.AbsPath = new String(source.AbsPath);
        }
        if (source.ColNo != null) {
            this.ColNo = new Long(source.ColNo);
        }
        if (source.Filename != null) {
            this.Filename = new String(source.Filename);
        }
        if (source.Function != null) {
            this.Function = new String(source.Function);
        }
        if (source.LineNo != null) {
            this.LineNo = new Long(source.LineNo);
        }
        if (source.InApp != null) {
            this.InApp = new Long(source.InApp);
        }
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.Package != null) {
            this.Package = new String(source.Package);
        }
        if (source.StackLevel != null) {
            this.StackLevel = new Long(source.StackLevel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AbsPath", this.AbsPath);
        this.setParamSimple(map, prefix + "ColNo", this.ColNo);
        this.setParamSimple(map, prefix + "Filename", this.Filename);
        this.setParamSimple(map, prefix + "Function", this.Function);
        this.setParamSimple(map, prefix + "LineNo", this.LineNo);
        this.setParamSimple(map, prefix + "InApp", this.InApp);
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "Package", this.Package);
        this.setParamSimple(map, prefix + "StackLevel", this.StackLevel);

    }
}

