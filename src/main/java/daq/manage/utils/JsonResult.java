package daq.manage.utils;

import java.io.Serializable;

/**
 * json 结果返回对象
 * @author tomdeng
 */
@SuppressWarnings("serial")
public class JsonResult<T> implements Serializable {
    private boolean success;
    private String msg;
    private T data;

    public JsonResult() {
        this(true, "");
    }

    public JsonResult(T data) {
        this(true, "");
        this.data = data;
    }

    public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public JsonResult(boolean success, String msg) {
        this.success = success;
        this.msg = msg;
    }
}
